package es.com.escuela_it.main.dtfutbol;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatterDate {

	public static void main(String[] args) {

	}

	private void imprimirFecha(LocalDateTime localDateTime) {
		
		Locale.setDefault(Locale.CANADA_FRENCH);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy HH:mm:ss");

		String dateStr = formatter.format(localDateTime);
		
		System.out.println(dateStr);

	}

}
