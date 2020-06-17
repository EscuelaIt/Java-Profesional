package es.com.escuela_it.main.clase3.archivos;

public class MostrarJugador {
	
	public static void main(String[] args) {
		
		Jugador jugador = new Jugador();
		
		jugador.setNombre("Ramos");
		jugador.setNumeroCamiseta(7);
		
		Jugador jugador2 = new Jugador();
		
		jugador2.setNombre("RamOS");
		jugador2.setNumeroCamiseta(7);
		
		
		boolean sonIguales = jugador.equals(jugador2);
		
		System.out.println(sonIguales);
		
	}

}
