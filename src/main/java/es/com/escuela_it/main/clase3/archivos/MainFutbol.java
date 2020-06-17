package es.com.escuela_it.main.clase3.archivos;

import java.util.Scanner;

import es.com.escuela_it.main.clase2.exceptions.NoCreditTeamException;

public class MainFutbol {
	
	public static void main(String[] args) {
		
		importerDelegetor();
		
	}
	
	public static void importerDelegetor()  {
		
		UpdateManager updateManager = new UpdateManager();
		
		try {

			updateManager.comprarJugadores("", -1);
		
		
		} catch (NoCreditTeamException e) {
			
			System.out.println("URL no es valido. ");
			
			try (Scanner sc = new Scanner(System.in)){
				
				String url = sc.nextLine();
				
				System.out.println(url);
				
			}
			
		}
		
	}
	
	

}
