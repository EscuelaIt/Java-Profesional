package es.com.escuela_it.main.clase5.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class SanatorioJugadoresColaPrioridad {

	public static void main(String[] args) {

		Queue<JugadorPlayer> filaDeJugadores = new PriorityQueue<>(new LesionComparator());

		// en lugar al add
		filaDeJugadores.offer(new JugadorPlayer("Cristiano", 3));
		filaDeJugadores.offer(new JugadorPlayer("Messi", 10));
		filaDeJugadores.offer(new JugadorPlayer("Benzema", 2));
		filaDeJugadores.offer(new JugadorPlayer("Marcelo", 4));

		while (!filaDeJugadores.isEmpty()) {

			System.out.println(filaDeJugadores.poll().getName());
		}

	}

}
