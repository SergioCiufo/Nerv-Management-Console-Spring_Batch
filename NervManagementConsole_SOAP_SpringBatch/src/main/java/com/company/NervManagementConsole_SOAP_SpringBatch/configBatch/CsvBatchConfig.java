package com.company.NervManagementConsole_SOAP_SpringBatch.configBatch;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;

import com.company.NervManagementConsoleSOAP_SpringBatch.generated.Mission;
import com.company.NervManagementConsole_SOAP_SpringBatch.configSoap.SoapClientConfig;
import com.company.NervManagementConsole_SOAP_SpringBatch.serviceSoap.SoapClient;
import com.company.NervManagementConsole_SOAP_SpringBatch.utils.MissionItemProcessor;

@Configuration
@EnableBatchProcessing
@Import(SoapClientConfig.class) //per importare la config di soapClientConfig (lo si fa per tenere il codice modulare e pulito)
public class CsvBatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private SoapClient soapClient;

    // Configurazione dell'ItemReader per leggere il file CSV
    @Bean
    public FlatFileItemReader<Mission> reader() {
        FlatFileItemReader<Mission> reader = new FlatFileItemReader<>();
        reader.setResource(new ClassPathResource("MissionEvent.csv"));
        reader.setLinesToSkip(4); // Salta le prime quattro righe (header)
        reader.setLineMapper(new DefaultLineMapper<Mission>() {{ //mappa ogni riga in un oggetto Mission
            setLineTokenizer(new DelimitedLineTokenizer() {{ //divide ogni riga del csv in campi separati da virgole //i nomi dei campi corrispondono agli attributi di mission
                setNames("releaseDate", "name", "description", "durationTime", "exp", "level", "participantsMax", "supportAbility", "synchronizationRate", "tacticalAbility", "image");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<Mission>() {{ //usa i nomi di setNames per associare i valori agli attributi della classe mission
                setTargetType(Mission.class);
            }});
        }});
        return reader;
    }

    // Configurazione dell'ItemProcessor per elaborare i dati
    @Bean
    public ItemProcessor<Mission, Mission> processor() {
        return new MissionItemProcessor(); //logica di trasformazione e validazione
    }

    // Configurazione dell'ItemWriter per scrivere i dati nel sistema SOAP
    @Bean
    public ItemWriter<Mission> writer() { //i dati validati da ItemProcessor verranno inviati al soapClient
        return new ItemWriter<Mission>() {
            @Override
            public void write(List<? extends Mission> items) throws Exception {
                for (Mission mission : items) {
                    soapClient.addMissionEvent(mission);
                }
            }
        };
    }

    // Definizione dello Step
    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Mission, Mission>chunk(10) //numero di "righe" prese alla volta dal csv, considerare prestazioni/transazioni, un numero basso potrebbe indicare un numero di transazioni alto nel db
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }

    // Definizione del Job //Richiama tutti i metodi citati in alto per il corretto funzionamento del lavoro
    @Bean
    public Job importMissionEventJob() { //esegue il metodo step che poi andrà ad eseguire il resto dei metodi
        return jobBuilderFactory.get("importMissionEventJob") // crea un nuovo Job chiamato "importMissionEventJob"
                .incrementer(new RunIdIncrementer())  // aggiunge un incrementatore di id per gestire la creazione di nuove esecuzioni del Job //il che significa che ogni volta che il Job viene eseguito, avrà un ID unico che viene incrementato.
                .start(step1())
                .build();
    }
}