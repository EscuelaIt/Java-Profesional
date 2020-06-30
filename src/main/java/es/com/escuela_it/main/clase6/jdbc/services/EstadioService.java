package es.com.escuela_it.main.clase6.jdbc.services;

import es.com.escuela_it.main.clase5.collections.Estadio;
import es.com.escuela_it.main.clase6.jdbc.dao.EstadioDao;

public class EstadioService {
	
	private EstadioDao estadioDao;
	
	public EstadioService() {

	}
	
	public void createStadium(Estadio estadio) {
		
		//Responsabilidades
		estadioDao = new EstadioDao();
		estadioDao.save(estadio);
		
	}

}
