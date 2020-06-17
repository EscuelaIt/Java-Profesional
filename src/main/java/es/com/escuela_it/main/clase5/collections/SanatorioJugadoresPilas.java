package es.com.escuela_it.main.clase5.collections;

import java.util.Deque;
import java.util.LinkedList;

public class SanatorioJugadoresPilas {

	public static void main(String[] args) {

		//Queue->Colas
		//Deque->Stack
		
		Deque<JugadorPlayer> filaDeJugadores = new LinkedList<>();

		// en lugar al add
		filaDeJugadores.offer(new JugadorPlayer("Cristiano", 3));
		filaDeJugadores.offer(new JugadorPlayer("Messi", 1));
		filaDeJugadores.offer(new JugadorPlayer("Benzema", 2));
		filaDeJugadores.offer(new JugadorPlayer("Marcelo", 4));

		while(!filaDeJugadores.isEmpty()) {
			
			System.out.println(filaDeJugadores.pollLast().getName());
		}

	}

}
