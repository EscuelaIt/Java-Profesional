package es.com.escuela_it.main.clase4.internacional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Prueba {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ITALY);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy HH:mm:ss");

		String dateStr = formatter.format(LocalDateTime.now());

		System.out.println(dateStr);

	}

}
