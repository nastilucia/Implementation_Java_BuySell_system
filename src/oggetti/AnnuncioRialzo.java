package oggetti;

import java.util.Scanner;

public class AnnuncioRialzo extends Annuncio {

	public double prezzoIniziale;
	public String dataScadenza;
	private double offertaCorrente;
	public String ultimoOfferente;

	public AnnuncioRialzo(String data, String descrizione, double prezzoIn,
			String dataSca) {
		super(data, descrizione); // ottimo

		this.prezzoIniziale = prezzoIn;
		this.dataScadenza = dataSca;
		this.ultimoOfferente = "Nessuno";
		this.offertaCorrente = this.prezzoIniziale; // CONTROLLARE

	}

	public AnnuncioRialzo(String data, String descrizione, double prezzoIn,
			String dataSca, double offerta) {
		this(data, descrizione, prezzoIn, dataSca);// CONTROLLARE

		this.offertaCorrente = offerta;
	}

	public double getPrezzoIniziale() {
		return prezzoIniziale;
	}

	public String getDataScadenza() {
		return dataScadenza;
	}

	public double getOffertaCorrente() {
		return offertaCorrente;
	}

	public String getUltimoOfferente() {
		return ultimoOfferente;
	}

	@Override
	public String toString() {

		String elementi = "L'offerta è cosi composta: \nPrezzo Iniziale: "
				+ this.getPrezzoIniziale() + "\nData di Scadenza:"
				+ this.getDataScadenza() + "\nOfferta Corrente: "
				+ this.getOffertaCorrente() + "\nOfferente Migliore: "
				+ this.getUltimoOfferente();

		return elementi;

	}
	/*public String fareOfferta(double nuovaOfferta){
		if (nuovaOfferta>this.getOffertaCorrente()){
		
		this.offertaCorrente=nuovaOfferta; 
	return "La nuova offerta parte da: " + this.offertaCorrente+ " "; 
		}
		else 
			return "Inserisci importo maggiore"; */
			
			
			
	
public void getAggiornaOfferta(double nuovaOfferta){
	this.offertaCorrente= nuovaOfferta; 
}
}


