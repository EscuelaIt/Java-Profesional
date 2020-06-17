package es.com.escuela_it.main.clase5.collections;

import java.util.ArrayList;
import java.util.List;

public class ListarEstadios {

	public static void main(String[] args) {

		List<Estadio> estadios = new ArrayList<>();

		estadios.add(new Estadio("Bernabeu", 70_000));
		estadios.add(new Estadio("Camp Nou", 82_000));
		estadios.add(new Estadio("Monumental", 62_000));
		estadios.add(new Estadio("San Petesburgo", 52_000));
		estadios.add(new Estadio("Bernabeu", 70_000));
		

		for (int i = 0; i < estadios.size(); i++) {
			
			Estadio est = estadios.get(i);
			System.out.println(est);
			
		} 
		
		System.out.println("______________________________________");
		
		for (Estadio estadio : estadios) {
			System.out.println(estadio);
		}
		
		System.out.println("______________________________________");
		
		Estadio estadioSeleccionado = buscarEstadioPorNombre(estadios, "Bernabeu");
		
		if (estadioSeleccionado != null) {
			
			System.out.println("Estadio encontrado: " + estadioSeleccionado);
		}
		
		estadios.remove(estadioSeleccionado);
		
		
		List<String> diccionario = getDiccionario();
		
		for (String string : diccionario) {
			System.out.println(string);
		}
		
	}
	
	
	public static Estadio buscarEstadioPorNombre(List<Estadio> listado,String name){
		
		for (Estadio estadio : listado) {
			
			if (estadio.getName().equalsIgnoreCase("bernabeu")) {
				
					return estadio;
			}
			
		}
		
		return null;
	}
	
	
	public static List<String> getDiccionario(){
		
		return new ArrayList<String>();
	}

}
