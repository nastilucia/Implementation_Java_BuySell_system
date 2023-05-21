package interfacceInterazione;

import java.util.*;

import oggetti.AnnuncioRialzo;
//import oggetti.GestioneDate;
import oggetti.GestioneRialzo;

public class UserVision {

	public static void main(String[] args) {

		int scelta = 0;
		GestioneRialzo gestione = new GestioneRialzo();// Questo va
														// inizializzato
														// all'accensione del
														// programma
		/* GestioneDate dataSistema= new GestioneDate(); */
		GregorianCalendar gc = new GregorianCalendar();
		int giorno = gc.get(Calendar.DAY_OF_MONTH);
		String giornoStringa = Integer.toString(giorno);
		int mese = gc.get((Calendar.MONTH) + 1);
		String meseStringa = Integer.toString(mese);
		int anno = gc.get(Calendar.YEAR);
		String annoStringa = Integer.toString(anno);
		String dataSistema = "" + giornoStringa + "-" + meseStringa
				+ "-" + annoStringa + "\n";
		boolean menu = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Benvenuto! Come ti chiami?");
		String nomeUser = input.nextLine();
		System.out.println("Benvenuto " + nomeUser + "!");
		do {

			System.out
					.println("\nCosa desideri fare? Scegliere una delle seguenti opzioni");
			System.out.println("1) Creare un Annuncio al rialzo!");
			System.out.println("2) Visualizza Annunci al rialzo!");
			System.out.println("3) Visualizza gli annunci filtrati per data!");
			System.out.println("4) Visualizza gli annunci al rialzo scaduti!");
			System.out.println("5) Inserisci nuova offerta!");
			System.out.println("6) Elimina tutti gli annunci");
			switch (input.nextLine()) {

			case "1": {
				System.out.println("Inserisci nome prodotto:");
				String descrizione = input.nextLine();
				System.out
						.println("Inserisci data pubblicazione dell'annuncio nel formato gg/mm/aa:");
				String data = input.nextLine();
				System.out
						.println("Inserisci data di scadenza dell'annuncio nel formato gg/mm/aa:");
				String dataSca = input.nextLine();
				System.out
						.println("Inserisci l'offerta iniziale da cui vuoi partire:");
				double offerta = Double.parseDouble(input.nextLine());
				System.out.println("Inserisci prezzo iniziale del prodotto: ");
				double prezzoIn = Double.parseDouble(input.nextLine());

				AnnuncioRialzo nuovo = new AnnuncioRialzo(data, descrizione,
						prezzoIn, dataSca, offerta);
				gestione.inserisciAnnuncioR(nuovo);

				break;
			}

			case "2": {
				System.out.println(gestione.visualizza());
				break;
			}

			case "3": {
				System.out.println("Inserisci data:");
				String nuovaData = input.nextLine();
				System.out.println(gestione.filtroRialzo(nuovaData));
				break;
			}

			case "4": {

				/*
				 * System.out.println("Inserisci la data attuale:"); String
				 * dataSistema= input.nextLine();
				 */
				

				System.out.println(gestione.annunciScaduti(dataSistema));
				break;
				// System.out.println(gestione.annunciScaduti(dataSistema));
				// break;

			}
			case "5":{
				System.out.println(nomeUser + ", ricordi l'ID del prodotto?");
				boolean controllo=false; 
				do {
					String r= input.nextLine(); 
					if (r.equalsIgnoreCase("si")){//CONTROLLARE QUESTO NON FUNZIONA BENE YO YO YO 
						System.out.println("Inserisci ID del prodotto");
					int p= input.nextInt(); 
					System.out.println("Inserisci l'importo della nuova offerta");
					double nuovaOfferta1=input.nextDouble();
					System.out.println(gestione.aggiungiOfferta(p, nuovaOfferta1, controllo));
					}
					else if (r.equalsIgnoreCase("no")){// CONTROLLARE QUESTO NON FUNZIONA BEEEEENNEEE PUPPIIII YO YO YO 
						System.out.println("Ecco l'elenco: "+ "\n"+ gestione.visualizza() + "\n");
						System.out.println("Inserisci ID del prodotto");
						int id= input.nextInt(); 
						System.out.println("Inserisci l'importo della nuova offerta: ");
						double nuovaOfferta=input.nextDouble();
						System.out.println(gestione.aggiungiOfferta(id, nuovaOfferta, controllo));	
					}
					
				} while (controllo); 
			
				
				
			}
			case "6": {
				System.out.println (gestione.eliminaAnnuncio(dataSistema)); break; 
			}
			
				
			default:
				break;
			}

		} while (menu);

	}

}
