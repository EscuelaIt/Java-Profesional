package es.com.escuela_it.main.dtfutbol;

import java.time.LocalDate;
import java.time.Period;

public class JodaPeriod {
	
	public static void main(String[] args) {
		
		Period period = Period.between(LocalDate.now(), LocalDate.now().plusMonths(6));
		
		
		System.out.println(period.getYears());
		
	}

}
