//packages
package testAnn;

import java.util.Scanner; 

import oggetti.AnnuncioRialzo;
import oggetti.Annuncio;
//Prova TestAnnuncioAlrialzo
public class TestAnnuncioAlrialzo {
	public static void main(String [] args){
		Scanner input= new Scanner (System.in);
		System.out.println("Benvenuto!");
		
		 System.out.println("Inserisci nome prodotto: ");
		 String nome= input.nextLine(); 
		 
		 System.out.println("Inserisci data pubblicazione dell'annuncio nel formato gg/mm/aa: ");
		 String data= input.nextLine();
		
		 System.out.println("Inserisci prezzo iniziale del prodotto: ");
		 double prezzo= input.nextDouble();
		
		 System.out.println("Inserisci data di scadenza dell'annuncio nel formato gg/mm/aa:");
		 String dataS= input.nextLine(); 

		 System.out.println("Inserisci l'offerta iniziale da cui vuoi partire: ");
		 double offerta= input.nextDouble();
		 
		 
		 	

		}
	}

