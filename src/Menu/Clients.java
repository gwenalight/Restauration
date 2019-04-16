package Menu;

public class Clients {
	private String namec;

	public void setName(String tName) {
		namec = tName;
	}

	private String phonec;

	public void setPhone(String number) {
		phonec = number;
	}

	private String nourriture;

	public void setAl(String Danger) {
		nourriture = Danger;
	}

	private String addressec;

	public void setadresse(String loc) {
		addressec = loc;
	}

	public void commander() {
		System.out.println("Vous avez commandé le produit suivant:  " + nourriture);
		System.out.println("Votre commande au nom de " + namec + "vient d'être validé!");
	}
}
