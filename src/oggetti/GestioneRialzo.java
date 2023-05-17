package oggetti;

import java.util.Collection;
import java.util.Vector;

public class GestioneRialzo {
	AnnuncioRialzo nuovo;
	private Vector<AnnuncioRialzo> annunciRialzo;

	public GestioneRialzo() {
		// Soluzione temporanea
		// Bisogna implementare il caricamento del Vector dalla serializzazione
		// su file Binario
		// Deve avvenire ogni volta che viene inizializzato il Gestore in quanto
		// quest'ultimo è
		// Un oggetto UNICO e viene richiamato sempre all'accesso dell'utente,
		// quando parte UserVision

		annunciRialzo = new Vector<AnnuncioRialzo>();

	}

	public void inserisciAnnuncioR(AnnuncioRialzo nuovo) {
		// Soluzione temporanea
		// Bisogna implementare il salvataggio e aggiornamento del file binario
		// ad ogni aggiunta.

		annunciRialzo.add(nuovo);
	}

	/**
	 * 
	 * @return La Stringa contenente tutti gli annunci a rialzo
	 */

	public String visualizza() {

		String listAnnunci = "";
		for (AnnuncioRialzo a : annunciRialzo) {

			listAnnunci = "" + listAnnunci + "Id del Prodotto: " + a.getID()
					+ " Prodotto: " + a.descrProdotto + " \n";

		}

		return listAnnunci;

	}

	/**
	 * Ritorna l'annuncio con l'id id
	 * 
	 * @param id
	 * @return
	 */

	public String visualizza(int id) {

		return null;

	}

	public String filtroRialzo(String nuovaData) {
		String filterAnnunci = "";
		for (AnnuncioRialzo a : annunciRialzo) {
			if (a.dataPubblicazione.compareTo(nuovaData) >= 0)
				filterAnnunci = "" + filterAnnunci + "Id del prodotto: "
						+ a.getID() + " Prodotto: " + a.descrProdotto
						+ "Data di Scadenza: " + a.getDataScadenza() + " \n";

		}
		return filterAnnunci;
	}

	public String annunciScaduti(String dataSistema) {
		String annunciScad = "";
		for (AnnuncioRialzo a : annunciRialzo) {
			if (a.dataScadenza.compareTo(dataSistema) < 0)
				annunciScad = "" + annunciScad + "Id del prodotto: "
						+ a.getID() + " Prodotto: " + a.descrProdotto
						+ "Data di Scadenza: " + a.getDataScadenza() + " \n";

		}
		return annunciScad;
	}

	public boolean aggiungiOfferta(int id, double nuovaOfferta,
			boolean controllo) {
		String offerteNuove = "";

		for (AnnuncioRialzo a : annunciRialzo) {
			if (id == a.getID() && nuovaOfferta > a.getOffertaCorrente()) {

				a.getAggiornaOfferta(nuovaOfferta);
				offerteNuove = "" + offerteNuove
						+ " Il prodotto selezionato è " + a.descrProdotto
						+ "\n";

				controllo = true;
				System.out.println("La nuova offerta parte da: " + nuovaOfferta
						+ " ");

			}

			else if (!(id == a.getID())
					|| !(nuovaOfferta > a.getOffertaCorrente())) {

				controllo = false;
				

			}
		}
		return controllo;
	}
	
	public String eliminaAnnuncio(String dataSistema){
		for (AnnuncioRialzo a : annunciRialzo){
			if (a.dataScadenza.compareTo(dataSistema) < 0);
		  
		}
	return "Ok"; 
}
}
