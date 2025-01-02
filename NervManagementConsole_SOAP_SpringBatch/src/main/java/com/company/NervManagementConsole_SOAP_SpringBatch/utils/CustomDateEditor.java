package com.company.NervManagementConsole_SOAP_SpringBatch.utils;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomDateEditor extends PropertyEditorSupport {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            // Parsing della stringa in LocalDate
            LocalDate localDate = LocalDate.parse(text, formatter);
            setValue(localDate);
        } catch (Exception e) {
            setValue(null);  // Gestisci eventuali errori di parsing
        }
    }

    @Override
    public String getAsText() {
        LocalDate value = (LocalDate) getValue();
        return value != null ? value.toString() : "";
    }
}