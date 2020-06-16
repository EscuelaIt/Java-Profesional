package es.com.escuela_it.main;

import es.com.escuela_it.main.exceptions.NoCreditTeamException;

public class UpdateManager {

	public void comprarJugadores(String url,int creditoEquipo) throws NoCreditTeamException {
		
		
		if (creditoEquipo<0) {
			
			throw new NoCreditTeamException();
		}

		// jsoup
		//new URL("www.mijuegoFutbolOnline.com.noexiste").openConnection().connect();

	}

}
