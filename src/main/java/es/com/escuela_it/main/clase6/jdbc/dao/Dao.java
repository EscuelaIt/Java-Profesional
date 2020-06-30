package es.com.escuela_it.main.clase6.jdbc.dao;

import java.util.List;
import java.util.Optional;

import es.com.escuela_it.main.clase5.collections.Estadio;

public interface Dao<T> {

	public List<T> listAll();

	public Optional<T> findById(long id);

	public void save(T t);

	public void delete(T t);

	public Estadio update(T t);

}
