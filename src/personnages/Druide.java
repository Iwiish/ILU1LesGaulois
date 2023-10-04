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
	
	public Random nextInt() {
		return (new Random());
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

	public void preparerPotion(Druide druide, int effetPotionMax) {
		
		Random random = nextInt();
        int forcePotionL = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;

        if (forcePotionL > 7) {
            druide.parler("J'ai préparé une super potion de force : " + forcePotionL);
        } else {
            druide.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force : " + forcePotionL +".");
        }
        //changements
        this.forcePotion = forcePotionL;
        System.out.println(forcePotion);
	}
	
	public void booster(Gaulois gaulois) {
		String nomDonner = gaulois.getNom();
		if (nomDonner != null && nomDonner.equals("Obélix")) {
			parler("Non, Obélix !... Tu n'auras pas de potion magique !");
			gaulois.parler("Par Bélénos, ce n'est pas juste !");
		}
		else {
			gaulois.boirePotion(forcePotion);
		}
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("panoramix", 5, 10);
		panoramix.preparerPotion(panoramix, 10);
	}

}
