package com.company.NervManagementConsole_SOAP_SpringBatch.configSoap;

import javax.xml.ws.BindingProvider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.company.NervManagementConsoleSOAP_SpringBatch.generated.MissionEventServiceSoap;
import com.company.NervManagementConsoleSOAP_SpringBatch.generated.MissionEventServiceSoapService;
import com.company.NervManagementConsole_SOAP_SpringBatch.serviceSoap.SoapClient;


@Configuration
@ComponentScan(basePackages = "com.company.NervManagementConsole_SOAP_SpringBatch")
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.company.NervManagementConsoleSOAP_SpringBatch.generated"); // package generato dal wsdl
        return marshaller;
    }

    @Bean
    public MissionEventServiceSoap port(Jaxb2Marshaller marshaller) {
        MissionEventServiceSoapService service = new MissionEventServiceSoapService();
        MissionEventServiceSoap port = service.getMissionEventServiceSoapPort();

        ((BindingProvider) port).getRequestContext()
            .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/NervManagementConsoleREST/soap/MissionEventServiceSoap");
      
        return port;
    }
    
    @Bean
    public SoapClient soapClient(MissionEventServiceSoap missionEventServiceSoap) {
        // Crea e restituisci il client Soap
        return new SoapClient(missionEventServiceSoap);
    }
    
}
