package es.com.escuela_it.main.clase3.archivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class InfoFile {
	
	public static void main(String[] args) throws IOException {
		
		Path file = Paths.get("c:" + File.separatorChar + "data" + File.separatorChar + "archivo.txt");
		
		UserPrincipal user = Files.getOwner(file);
		
		System.out.println(user.getName());
		
		//Ctrl + Alt grf + L + 2
		FileTime fileTime = Files.getLastModifiedTime(file);
		
		System.out.println(fileTime.toString());
		
		Files.isWritable(file);
		Files.isReadable(file);
		Files.isExecutable(file);
				
	}
}
