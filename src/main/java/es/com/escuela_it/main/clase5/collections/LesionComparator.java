package es.com.escuela_it.main.clase5.collections;

import java.util.Comparator;

public class LesionComparator implements Comparator<JugadorPlayer> {

	@Override
	public int compare(JugadorPlayer o1, JugadorPlayer o2) {
		return o2.getLesion() - o1.getLesion();
	}
	
	
	

}
