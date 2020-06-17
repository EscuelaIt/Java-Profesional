package es.com.escuela_it.main.clase4.internacional;

import java.time.LocalDate;

public class Jugador {

	private String name;

	private int camiseta;

	private boolean capitan;

	private LocalDate fechaNacimienta;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the camiseta
	 */
	public int getCamiseta() {
		return camiseta;
	}

	/**
	 * @param camiseta the camiseta to set
	 */
	public void setCamiseta(int camiseta) {
		this.camiseta = camiseta;
	}

	/**
	 * @return the capitan
	 */
	public boolean isCapitan() {
		return capitan;
	}

	/**
	 * @param capitan the capitan to set
	 */
	public void setCapitan(boolean capitan) {
		this.capitan = capitan;
	}

	/**
	 * @return the fechaNacimienta
	 */
	public LocalDate getFechaNacimienta() {
		return fechaNacimienta;
	}

	/**
	 * @param fechaNacimienta the fechaNacimienta to set
	 */
	public void setFechaNacimienta(LocalDate fechaNacimienta) {
		this.fechaNacimienta = fechaNacimienta;
	}

}
