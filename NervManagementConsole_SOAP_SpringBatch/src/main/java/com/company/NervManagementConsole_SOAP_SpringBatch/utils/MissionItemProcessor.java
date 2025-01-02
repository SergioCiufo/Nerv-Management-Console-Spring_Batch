package com.company.NervManagementConsole_SOAP_SpringBatch.utils;

import java.time.LocalDate;

import org.springframework.batch.item.ItemProcessor;

import com.company.NervManagementConsoleSOAP_SpringBatch.generated.Mission;

public class MissionItemProcessor implements ItemProcessor<Mission, Mission> {

	@Override
	public Mission process(Mission mission) throws Exception {
	    if (mission.getReleaseDate() == null) {
	        return null;
	    }

	    try {
	        LocalDate missionReleaseDate = LocalDate.parse(mission.getReleaseDate());
	        LocalDate today = LocalDate.now();

	        if (today.equals(missionReleaseDate)) {
	            mission.setEventMission(true);
	            mission.setAvailable(true);
	            return mission;
	        }
	    } catch (Exception e) {
	    	e.printStackTrace();
	        return null;
	    }
	    return null;  // Se non è il giorno giusto, salta questa missione
	}
}