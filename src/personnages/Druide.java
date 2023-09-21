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

	public int nextInt(int effetPotionMax) {
		
		Random random = preparerPotion();
        int forcePotion = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;

        Druide panoramix = new Druide("panoramix", 0, 10);

        if (forcePotion > 7) {
            panoramix.parler("J'ai préparé une super potion de force");
        } else {
            panoramix.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force : ");
            System.out.println(forcePotion);
        }
        
        return forcePotion;
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("panoramix", 5, 10);
		panoramix.nextInt(10);
	}

}
