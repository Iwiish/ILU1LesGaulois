package personnages;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois [] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public boolean ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois ++;
		return true;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return (villageois[numero]);
	}
	
	
	public void afficherVillageois() {
		System.out.println(nbVillageois);
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les legendaires gaulois : ");
		for (int i = 0; i < (nbVillageois); i++) {
			System.out.println(villageois[i].getNom());
		}
	
	}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
//		at personnages.Village.trouverHabitant(Village.java:31)
//		at personnages.Village.main(Village.java:37)
//		parce que tableau commence à 0 donc va de 0 à 29
		
		Chef abra = new Chef("Abraracourcix", 6, 0, village);
		village.setChef(abra);
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		
		Gaulois gaulois = village.trouverHabitant(0);
		Gaulois gaulois1 = village.trouverHabitant(1);
		System.out.println(gaulois);
		System.out.println(gaulois1);
		
//		null car le premier habitant est à l'index 0
		
		village.afficherVillageois();
		
	}

}

