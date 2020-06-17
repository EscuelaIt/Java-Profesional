package es.com.escuela_it.main.clase5.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ListadoEstadiosPorCiudad {
	
	public static void main(String[] args) {
		
		Map<String,Estadio> estadiosPorCiudades = new HashMap<>();
		
		estadiosPorCiudades.put("Madrid",new Estadio("Bernabeu", 70_000));
		estadiosPorCiudades.put("Barcelona",new Estadio("Camp Nou", 82_000));
		estadiosPorCiudades.put("Buenos Aires",new Estadio("Monumental", 62_000));
		estadiosPorCiudades.put("San Petesburgo",new Estadio("San Petesburgo", 52_000));
		estadiosPorCiudades.put("Madrid",new Estadio("Bernabeu", 70_000));
		
		Estadio estadioRecuperado = estadiosPorCiudades.get("Madrid");
		
		System.out.println(estadioRecuperado);
		
		Set<String> ciudades = estadiosPorCiudades.keySet();
		
		for (String ciudad : ciudades) {
			System.out.println(ciudad + " -> " + estadiosPorCiudades.get(ciudad));
		}
		
	}

}
