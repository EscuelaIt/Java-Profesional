package es.com.escuela_it.main.clase4.internacional;

import java.time.Duration;
import java.time.LocalDateTime;

public class JodaLocalDateTime {
	
	public static void main(String[] args) {
		
		LocalDateTime startTime = LocalDateTime.now();
		
		System.out.println(startTime.getHour());
		System.out.println(startTime.getMinute());
		System.out.println(startTime.getSecond());
		System.out.println(startTime.getNano());
		
		LocalDateTime endTime = LocalDateTime.now();
		
		Duration duration = Duration.between(startTime, endTime);
		
		System.out.println(duration.toMillis());
		
		
		
		
	}

}
