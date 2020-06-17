package es.com.escuela_it.main.clase5.collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntosOrdenados {
	
	public static void main(String[] args) {
		
		Set<Estadio> estadios = new TreeSet<>();
		
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
