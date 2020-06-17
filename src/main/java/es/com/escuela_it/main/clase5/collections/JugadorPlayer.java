package es.com.escuela_it.main.clase5.collections;

public class JugadorPlayer {

	private String name;

	private int lesion;

	public JugadorPlayer(String name, int lesion) {
		super();
		this.name = name;
		this.lesion = lesion;
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
	 * @return the lesion
	 */
	public int getLesion() {
		return lesion;
	}

	/**
	 * @param lesion the lesion to set
	 */
	public void setLesion(int lesion) {
		this.lesion = lesion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lesion;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof JugadorPlayer))
			return false;
		JugadorPlayer other = (JugadorPlayer) obj;
		if (lesion != other.lesion)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
