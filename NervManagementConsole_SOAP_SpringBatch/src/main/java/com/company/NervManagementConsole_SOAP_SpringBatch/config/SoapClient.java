package com.company.NervManagementConsole_SOAP_SpringBatch.config;

import org.springframework.stereotype.Component;

import com.company.NervManagementConsoleSOAP_SpringBatch.generated.Mission;
import com.company.NervManagementConsoleSOAP_SpringBatch.generated.MissionEventServiceSoap;

@Component
public class SoapClient {

    private final MissionEventServiceSoap port;

    public SoapClient(MissionEventServiceSoap port) {
        this.port = port;
    }

    // Metodo che invoca il metodo addMissionEvent del servizio SOAP
    public Mission addMissionEvent(Mission mission) {
        return port.addMissionEvent(mission);
    }
}