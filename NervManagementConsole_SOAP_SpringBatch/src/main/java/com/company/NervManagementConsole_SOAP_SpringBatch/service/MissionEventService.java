package com.company.NervManagementConsole_SOAP_SpringBatch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.NervManagementConsole_SOAP_SpringBatch.config.SoapClient;
import com.company.NervManagementConsole_SOAP_SpringBatch.utils.CsvReaderUtils;

@Service
public class MissionEventService {

    private final CsvReaderUtils csvReader;
    private final SoapClient soapClient;

    @Autowired
    public MissionEventService(CsvReaderUtils csvReader, SoapClient soapClient) {
        this.csvReader = csvReader;
        this.soapClient = soapClient;
    }

    public void processAndSendMissionEvents(String csvFileName) {
        csvReader.processMissionEventCsv(csvFileName, soapClient);
    }
}