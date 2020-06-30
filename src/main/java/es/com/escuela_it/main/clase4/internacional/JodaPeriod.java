package es.com.escuela_it.main.clase4.internacional;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class JodaPeriod {
	
	public static void main(String[] args) {
		
		Period period = Period.between(LocalDate.now(), LocalDate.now().plusMonths(6));				
		System.out.println(period.getYears());
		
		Duration between = Duration.between(LocalDate.now(), LocalDate.now());
		System.out.println(between);
	}

}
