package es.com.escuela_it.main.clase5.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListarEstadiosStreams {

	public static void main(String[] args) throws Exception {

		List<Estadio> estadios = new ArrayList<>();

		estadios.add(new Estadio("Bernabeu", 70_000));
		estadios.add(new Estadio("Camp Nou", 82_000));
		estadios.add(new Estadio("Monumental", 62_000));
		estadios.add(new Estadio("San Petesburgo", 52_000));
		estadios.add(new Estadio("Bernabeu", 70_000));

		List<Estadio> estadiosConMasAforo = estadios.stream().filter((e) -> e.getAforo() >= 70000)
				.collect(Collectors.toList());

		estadiosConMasAforo.forEach(e -> System.out.println(e));

		Optional<Estadio> estadioPosible = estadios.parallelStream().filter(e -> e.getName().equals("Bernabeu"))
				.findFirst();

		estadioPosible.ifPresent(e -> System.out.println(e));

		estadioPosible.orElseThrow(Exception::new);

	}

}
