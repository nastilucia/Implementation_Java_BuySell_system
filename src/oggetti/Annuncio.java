package oggetti;

public class Annuncio {

	public String dataPubblicazione;
	public String descrProdotto;

	private static int ultimoID = 1000;
	private int ID;

	public Annuncio(String data, String descrizione) {

		this.dataPubblicazione = data;
		this.descrProdotto = descrizione;

		this.ID = ultimoID + 1;
		ultimoID++;
	}

	public int getID() {
		return ID;
	}

	/*
	 * public String getData(GestioneDate dataSistema){
	 * 
	 * 
	 * 
	 * return ""+
	 * dataSistema.getGiorno()+"-"+dataSistema.getMese()+"-"+dataSistema
	 * .getAnno(); }
	 */

}
