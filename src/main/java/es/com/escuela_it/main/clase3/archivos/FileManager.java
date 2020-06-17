package es.com.escuela_it.main.clase3.archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileManager {

	public static void main(String[] args) {

		new FileManager().eliminarArhivo();

	}

	public void eliminarArhivo() {

		System.out.println("Esto se ejecuta");

		try {

			System.out.println("Por eliminar un archivo");

			Files.delete(Paths.get("c://archivoNoExistente.txt"));

			System.out.println("Nunca llega aqui");

		} catch (NoSuchFileException e) {

			System.out.println("No se encontro el archivo " + e.getMessage());

		} catch (IOException e) {

			System.out.println("Se ha producido un error de io " + e.getMessage());

		} finally {

			System.out.println("cerrando recurso");

		}

		System.out.println("continua el programa normalmente");

	}

}
