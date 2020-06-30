package es.com.escuela_it.main.clase6.jdbc;

import es.com.escuela_it.main.clase5.collections.Estadio;
import es.com.escuela_it.main.clase6.jdbc.services.EstadioService;

public class Controller {
	
	public static void main(String[] args) {
		
		EstadioService estadioService = new EstadioService();
		estadioService.createStadium(new Estadio("Bernabeu",44444));
		
	} 
	

}
