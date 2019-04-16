package Lanceur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Menu.Clients;
import Menu.Fournisseur;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("Veuillez entrer votre nom");
			String user = input.next();
			System.out.println("Votre addresse sans espace");
			String userloc = input.next();
			System.out.println("et votre numero de telephone");
			String userphone = input.next();
			System.out.println("Voici les produits dont dispose notre fournisseur:");

			List<String> produits = new ArrayList<>();
			produits.add("pomme");
			produits.add("fraise");
			produits.add("choco");
			System.out.println(produits);
			System.out.println("Veuillez indiquer le nom du produit que vous voulez acheter");
			String userproduits = input.next();

			System.out.println("Les produits se vendent en différentes quantité les voicis:");
			String[] quantite = { "1.0kg", "1.5kg", "2.0kg" }; // Comment faire un mixte entre avec et sans virgule avec
																// autre type ex:1 et comment
																// pouvoir ecrire kg dedans en mme tps
			for (String efer : quantite) {
				System.out.println(efer);
			}

			System.out.println("Veuillez indiquer la quantité souhaitée");
			String userquantite = input.next();

			Clients c = new Clients();
			c.setName(user + " ");
			c.setadresse(userloc);
			c.setPhone(userphone);
			c.setAl(userquantite + "kg de " + userproduits);
			c.commander();

//			Clients c1 = new Clients();
//			c1.setName(user + " ");
//			c1.setadresse(userloc);
//			c1.setPhone(userphone);
//			c1.setAl(userquantite + "kg de " + userproduits);
//			c1.commander();
//
//			Clients c2 = new Clients();
//			c2.setName(user + " ");
//			c2.setadresse(userloc);
//			c2.setPhone(userphone);
//			c2.setAl(userquantite + "kg de " + userproduits);
//			c2.commander();

////		Clients c1 = cc; ???possible??? ensuite crer une BOUCLE!!!!!!!!!!!!

//			Clients c12 = new Clients();
//			c12.setName(user + " ");
//			c12.setadresse(userloc);
//			c12.setPhone(userphone);
//			c12.setAl(userquantite + "kg de " + userproduits);
//			c12.commander();
//		

			Fournisseur f1 = new Fournisseur();
			f1.setName("Le petit jardin");
			f1.setPhone(3805);
			f1.setAd("8rue du moulin 58945 Warsaw à la première heure demain matin");
			f1.livrer();

			input.close();
		}

	}
}
