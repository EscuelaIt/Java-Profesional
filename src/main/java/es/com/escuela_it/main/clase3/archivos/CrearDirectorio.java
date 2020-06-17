package es.com.escuela_it.main.clase3.archivos;

import java.io.File;

public class CrearDirectorio {
	
	public static void main(String[] args) {
		
		File dir = new File("c:" + File.separator +  "data2");
		
		System.out.println(dir.mkdir());
	}

}
