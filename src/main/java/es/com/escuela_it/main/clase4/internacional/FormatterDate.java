package es.com.escuela_it.main.clase4.internacional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatterDate {

	public static void main(String[] args) {

	}

	public void imprimirFecha(LocalDateTime localDateTime) {
		
		Locale.setDefault(Locale.CANADA_FRENCH);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy HH:mm:ss");

		String dateStr = formatter.format(localDateTime);
		
		System.out.println(dateStr);

	}

}
