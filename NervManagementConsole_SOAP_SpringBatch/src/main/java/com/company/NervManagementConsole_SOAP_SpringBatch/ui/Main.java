package com.company.NervManagementConsole_SOAP_SpringBatch.ui;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.company.NervManagementConsole_SOAP_SpringBatch.configBatch.CsvBatchConfig;

public class Main {
	
    public static void main(String[] args) {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(CsvBatchConfig.class); //carichiamo la configurazione
    	 
         JobLauncher jobLauncher = context.getBean(JobLauncher.class); //il JobLauncher esegue il Job, che avvia gli Step configurati (come step1).
         Job job = context.getBean("importMissionEventJob", Job.class); //la stringa deve essere la stessa di "jobBuilderFactory" del job nella config

         try {
             jobLauncher.run(job, new JobParameters());
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
    
}

