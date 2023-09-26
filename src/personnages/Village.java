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
		return (villageois[numero-1]);
	}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
//		at personnages.Village.trouverHabitant(Village.java:31)
//		at personnages.Village.main(Village.java:37)
//		parce que tableau commence à 0 donc va de 0 à 29
		
		Chef chef = new Chef("Abraracourcix", 6, 0, village);
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		
//      null car commence à 0 donc pas de villageois à l'index 1
		
	}

}

