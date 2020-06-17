package es.com.escuela_it.main.clase5.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoEstadios {
	
	public static void main(String[] args) {
		
		Set<Estadio> estadios = new HashSet<>();
		
		estadios.add(new Estadio("Bernabeu", 70_000));
		estadios.add(new Estadio("Camp Nou", 82_000));
		estadios.add(new Estadio("Monumental", 62_000));
		estadios.add(new Estadio("San Petesburgo", 52_000));
		estadios.add(new Estadio("Bernabeu", 70_000));
		
		for (Estadio estadio : estadios) {
			System.out.println(estadio);
		}
		
	}

}
