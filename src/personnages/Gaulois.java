package personnages;

import java.lang.reflect.Method;
import villagegaulois.Musee;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees; 
	private Equipement[] tabTrophees = new Equipement[100];
	
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
		return("Le gaulois " + nom + " : ");
		}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.tabTrophees[nbTrophees] = trophees[i];
		}
	}

	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion += forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
	}
	
	public void faireUneDonnation(Gaulois gaulois, Musee musee) {
		if(tabTrophees != null) {
			System.out.println("Le gaulois " + gaulois.getNom() + "Je donne tous mes trophees : ");
			for (int i = 0; i < tabTrophees.length; i++)
			{
				musee.donnerTrophee(gaulois, tabTrophees[i]);
				System.out.println("-" + tabTrophees[i]);
			}
		}
	}
		
//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Astérix",8);
//		System.out.println(asterix);
//		System.out.println(asterix.nom);
//		System.out.println(asterix);
//		
//		asterix.parler("Coucou");
//		
//		Romain minus = new Romain("minus", 6);
//		asterix.frapper(minus);
//		
//		asterix.boirePotion(10);
//	}


	
}
