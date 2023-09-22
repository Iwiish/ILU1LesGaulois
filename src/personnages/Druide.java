package personnages;
import java.util.Random;

import java.lang.reflect.Method;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	
	}
	
	public Random preparerPotion() {
		Random random = new Random();
		return random;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»" );
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void nextInt(Druide druide, int effetPotionMax) {
		
		Random random = preparerPotion();
        int forcePotion = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;

        if (forcePotion > 7) {
            druide.parler("J'ai préparé une super potion de force");
        } else {
            druide.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force : " + forcePotion +".");
        }
	}
	
	public void booster(Druide druide, Gaulois gaulois) {
		String nom = gaulois.getNom();
		if (nom == "Obélix") {
			druide.parler("Non, Obélix !... Tu n'auras pas de potion magique !");
		}
		else {
			gaulois.boirePotion(forcePotion);
		}
	}
	
//	public static void main(String[] args) {
//		Druide panoramix = new Druide("panoramix", 5, 10);
//		panoramix.nextInt(10);
//	}

}
