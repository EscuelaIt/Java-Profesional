package es.com.escuela_it.main.clase3.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarPlantillas {
	
	public static void main(String[] args) {
		
		File file = new File("c:\\data\\plantilla.txt");
		
		try (FileWriter fw = new FileWriter(file)) {
		
			file.createNewFile();
			
			fw.append("1. Steguen\n");
			fw.append("2. Busquets\n");
			fw.append("10. Messi\n");
			fw.append("11. Suarez\n");
			
			
		} catch (IOException e) {

			System.out.println("Error escritura de archivo de plantilla " + e);
		}
		
		
		
		
		
	}

}
