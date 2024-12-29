package com.company.NervManagementConsole_SOAP_SpringBatch.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.company.NervManagementConsole_SOAP_SpringBatch.config.CsvConfig;
import com.company.NervManagementConsole_SOAP_SpringBatch.config.SoapClientConfig;
import com.company.NervManagementConsole_SOAP_SpringBatch.service.MissionEventService;

public class Main {
	
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class, CsvConfig.class);
        MissionEventService missionEventService = context.getBean(MissionEventService.class);

        missionEventService.processAndSendMissionEvents("MissionEvent.csv");
    }
}

