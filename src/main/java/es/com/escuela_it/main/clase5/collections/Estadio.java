package es.com.escuela_it.main.clase5.collections;

public class Estadio implements Comparable<Estadio>{
	
	private int id;
	
	private String name;
	
	private int aforo;
	

	public Estadio(String name, int aforo) {
		super();
		this.name = name;
		this.aforo = aforo;
	}

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
	 * @return the aforo
	 */
	public int getAforo() {
		return aforo;
	}

	/**
	 * @param aforo the aforo to set
	 */
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	@Override
	public String toString() {
		return "Estadio [name=" + name + ", aforo=" + aforo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aforo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Estadio))
			return false;
		Estadio other = (Estadio) obj;
		if (aforo != other.aforo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Estadio o) {
		return  o.aforo - this.aforo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	

}
