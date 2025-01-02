package com.company.NervManagementConsole_SOAP_SpringBatch.serviceSoap;

import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import com.company.NervManagementConsoleSOAP_SpringBatch.generated.Mission;
import com.company.NervManagementConsoleSOAP_SpringBatch.generated.MissionEventServiceSoap;

@Service
public class SoapClient {

    private final MissionEventServiceSoap port;

    public SoapClient(MissionEventServiceSoap port) {
        this.port = port;
    }

    // Metodo che invoca il metodo addMissionEvent del servizio SOAP
    public Mission addMissionEvent(Mission mission) {
    	System.out.println(mission.getReleaseDate() + " - " + mission.getName());
        return port.addMissionEvent(mission);
    }
}