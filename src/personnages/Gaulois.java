package personnages;

import java.lang.reflect.Method;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion += forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
	}
		
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix); //regarder sans method toString
		System.out.println(asterix.nom);
		System.out.println(asterix);
		
		asterix.parler("Coucou");
		
		Romain minus = new Romain("minus", 6);
		asterix.frapper(minus);
		
		asterix.boirePotion(10);
	}

//	créer la méthode boirePotion qui prend en paramètre d’entrée la force
//	de la potion et l’aecte à l’attribut eetPotion.
//	Le gaulois dit : « Merci Druide, je sens que ma force est 3 fois décuplée. »
//	si la force de la potion est de 3.
//	○ Modifier la méthode frapper pour prendre en compte l’eet de la
//	potion : la force du coup sera la force du gaulois divisée par 3 et
//	multipliée par l’eet de la potion.
//	b. Dans le main de la classe Gaulois, tester la méthode boirePotion
	
}
