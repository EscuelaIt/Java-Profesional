package es.com.escuela_it.main.clase5.collections;

import java.util.LinkedList;
import java.util.Queue;

public class SanatorioJugadoresCola {

	public static void main(String[] args) {

		Queue<JugadorPlayer> filaDeJugadores = new LinkedList<>();

		// en lugar al add
		filaDeJugadores.offer(new JugadorPlayer("Cristiano", 3));
		filaDeJugadores.offer(new JugadorPlayer("Messi", 1));
		filaDeJugadores.offer(new JugadorPlayer("Benzema", 2));
		filaDeJugadores.offer(new JugadorPlayer("Marcelo", 4));

		JugadorPlayer jugadorQueSeraAtendido = filaDeJugadores.peek();

		System.out.println(jugadorQueSeraAtendido.getName());

		JugadorPlayer jugadorAtendido = filaDeJugadores.poll();
		System.out.println(filaDeJugadores.size());

		System.out.println(jugadorAtendido.getName());
		jugadorAtendido = filaDeJugadores.poll();
		System.out.println(filaDeJugadores.size());

		System.out.println(jugadorAtendido.getName());
		
		while(!filaDeJugadores.isEmpty()) {
			
			System.out.println(filaDeJugadores.poll().getName());
		}

	}

}
