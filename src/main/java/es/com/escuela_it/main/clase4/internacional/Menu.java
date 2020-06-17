package es.com.escuela_it.main.clase4.internacional;

import java.util.Locale;
import java.util.ResourceBundle;

public class Menu {

	
	public static void main(String[] args) {

		Locale[] availableLocales = Locale.getAvailableLocales();
		
		for (Locale locale : availableLocales) {
			System.out.println(locale.getDisplayCountry() + " " + locale.getDisplayLanguage());
			
		}
		
		Locale.setDefault(new Locale("es","AR"));
		
		ResourceBundle messages = ResourceBundle.getBundle("messages");
	
		
		String button1 = messages.getString("app.main.button1");
		String button2 = messages.getString("app.main.button2");
		String button3 = messages.getString("app.main.button3");
		String button4 = messages.getString("app.main.button4");
		
		System.out.println(button1);
		System.out.println(button2);
		System.out.println(button3);
		System.out.println(button4);
		
		
		
		
	}
	
}
