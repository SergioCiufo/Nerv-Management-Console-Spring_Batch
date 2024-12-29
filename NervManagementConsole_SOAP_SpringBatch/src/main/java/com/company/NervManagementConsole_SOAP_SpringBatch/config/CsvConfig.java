package com.company.NervManagementConsole_SOAP_SpringBatch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.company.NervManagementConsole_SOAP_SpringBatch.utils.CsvReaderUtils;

@Configuration
public class CsvConfig {

    @Bean
    public CsvReaderUtils csvReader() {
        return new CsvReaderUtils();
    }
}