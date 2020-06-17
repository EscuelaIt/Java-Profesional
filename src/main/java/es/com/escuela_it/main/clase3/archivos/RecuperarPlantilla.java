package es.com.escuela_it.main.clase3.archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecuperarPlantilla {
	
	public static void main(String[] args) throws FileNotFoundException  {
		
		File file = new File("c:\\data\\plantilla.txt");
		
		try (Scanner sc = new Scanner(file)){
			
			while (sc.hasNext()) {
				
				String line = sc.nextLine();
				
				System.out.println(line);
				
			}
			
			
		}
		
	}

}
