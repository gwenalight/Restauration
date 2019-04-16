package Menu;

public class Fournisseur {
	private String namef;

	public void setName(String x) {
		namef = x;
	}

	private int phonef;

	public void setPhone(int nbr) {
		phonef = nbr;
	}

	private String adressef;

	public void setAd(String localisation) {
		adressef = localisation;
	}
	public void livrer() {
		System.out.println("Vous avez commandé chez "+namef);
		System.out.println("La livraison partira de chez notre fournisseur"+ adressef);
	}
}
