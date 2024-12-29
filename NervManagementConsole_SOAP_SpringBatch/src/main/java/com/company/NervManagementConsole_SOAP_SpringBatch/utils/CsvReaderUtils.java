package com.company.NervManagementConsole_SOAP_SpringBatch.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.company.NervManagementConsoleSOAP_SpringBatch.generated.Mission;
import com.company.NervManagementConsole_SOAP_SpringBatch.config.SoapClient;

public class CsvReaderUtils {
	
	 public void processMissionEventCsv(String csvFileName, SoapClient soapClient) {
	        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(csvFileName);
	             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
	            
	            String line;
	            while ((line = reader.readLine()) != null) {
	            	
	            	//salta i commenti
	            	if(line.startsWith("#") || line.isEmpty()) {
	            		continue;
	            	}
	            	
	                String[] missionData = line.split(","); //le virgole separano i valori
	                //prende la data di rilascio della missione (primo dato)
	                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	                LocalDate missionReleaseDate = LocalDate.parse(missionData[0], dateFormat);
	                
	                //prendiamo la data corrente
	                LocalDate today = LocalDate.now();
	                
	                //se le date corrispondono
	                if(today.equals(missionReleaseDate)) {
	                	Mission mission = new Mission();
		                mission.setName(missionData[1]);
		                mission.setDescription(missionData[2]);
		                mission.setDurationTime(Integer.parseInt(missionData[3]));
		                mission.setExp(Integer.parseInt(missionData[4]));
		                mission.setLevel(Integer.parseInt(missionData[5]));
		                mission.setParticipantsMax(Integer.parseInt(missionData[6]));;
		                mission.setSupportAbility(Integer.parseInt(missionData[7]));
		                mission.setSynchronizationRate(Integer.parseInt(missionData[8]));
		                mission.setTacticalAbility(Integer.parseInt(missionData[9]));
		                mission.setImage(missionData[10]);
		                mission.setEventMission(true);
		                mission.setAvailable(true);

		                soapClient.addMissionEvent(mission); //chiama il metodo di soapClient
		                
		                System.out.println("preso - "+missionData[1]);
	                }else {
	                	System.out.println("salto - " + missionData[1]);
	                }
	                
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
