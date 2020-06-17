package es.com.escuela_it.main.clase3.archivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteNio {
	
	
	public static void main(String[] args) throws IOException {
	
		Path file = Paths.get("c:" + File.separatorChar + "data" + File.separatorChar + "archivo.txt");
		
		List<String> lines =  Files.readAllLines(file);
		
		for (String line : lines) {
			
			System.out.println(line);
		
		}
		
	}

}
