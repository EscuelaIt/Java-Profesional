package es.com.escuela_it.main.clase4.internacional;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Utc {
	
	public static void main(String[] args) {
		
		Set<String> zonas = ZoneId.getAvailableZoneIds();
		
		for (String zona : zonas) {
			System.out.println(zona);
		}
		
		ZoneId zoneObject = ZoneId.of("Portugal");
	
		ZonedDateTime madridTiempo = ZonedDateTime.ofInstant(Instant.now(),zoneObject);
		
		System.out.println(madridTiempo.getHour());
		System.out.println(madridTiempo.getOffset().getId());
		
	}

}
