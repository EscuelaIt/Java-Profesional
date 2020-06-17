package es.com.escuela_it.main.clase3.archivos;

import java.util.ResourceBundle;

public class ApplicationConfigurator {

	public static void main(String[] args) {
		
		ResourceBundle applicationProperties = ResourceBundle.getBundle("application");

		String appName = applicationProperties.getString("app.name");
		String desc = applicationProperties.getString("app.description");
		String edition = applicationProperties.getString("app.edition");
		boolean enableOnlineMode = Boolean.parseBoolean(applicationProperties.getString("app.enable-online"));
		
		System.out.println(desc);
		System.out.println(edition);
		System.out.println(appName + " " + enableOnlineMode);
		
		
		if (enableOnlineMode) {
			
			System.out.println("Se puedo jugar online");
		}

	}

}
