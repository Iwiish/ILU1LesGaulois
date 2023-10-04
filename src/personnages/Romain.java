package personnages;

public class Romain {

	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement = 0;
	private String texte;

	public Romain(String nom, int force) {
		this.nom = nom;
		assert force >= 0 : "La force d'un Romain doit être positive";
		this.force = force;
		equipement = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() +  "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

//	public void recevoirCoup(int forceCoup) {
//		assert force >= 0 : "La force d'un Romain doit être positive";
//		int forceD = force;
//		force -= forceCoup;
//		int nvForce = force;
//		if (force > 0) {
//			parler("Aie");
//		} else {
//			parler("J'abandonne");
//		}
//		assert nvForce < forceD : "La force du Romain doit avoir diminué";
//	}
	
	
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// Precondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force = force - forceCoup;
		if(force == 0 || force < 0){
			parler("J'abandonne...");
		}else {
			equipementEjecte = ejecterEquipement();
			parler("Aïe");
		}
		assert force < oldForce;
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) { 
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipement[i] != null && equipement[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				}  else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
					}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup = forceCoup - resistanceEquipement;
		if (forceCoup<0) {
			forceCoup = 0;
		}
		return forceCoup;
	}
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipement[i] != null){
				equipementEjecte[nbEquipementEjecte] =
				equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
				}
			}
			return equipementEjecte;
	}

	
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
			case 2 :
				System.out.println("Le soldat" + getNom() + "est déjà bien protégé !");
				break;
			case 1 :
				if (this.equipement[0] == equipement) {
	                System.out.println("Le soldat " + getNom() + " possède déjà un " + equipement + " !");
	            } else {
	            	System.out.println("Le soldat" + getNom() + " s'equipe avec un " + equipement);
	                this.equipement[nbEquipement] = equipement;
	                nbEquipement++;
	            }
	            break;
			default :
				System.out.println("Le soldat" + getNom() + " s'equipe avec un casque ");
				this.equipement[nbEquipement] = equipement;
				nbEquipement++;
				break;
		}
		
	}
	
//	public static void main(String[] args) {
//		Romain minus = new Romain("minus", 6);
//		
//		minus.parler("Aie");
//		minus.recevoirCoup(3); 
//		
////		System.out.println(Equipement.CASQUE);
////		System.out.println(Equipement.BOUCLIER);
//		
//		minus.sEquiper(Equipement.CASQUE);
//		minus.sEquiper(Equipement.CASQUE);
//		minus.sEquiper(Equipement.BOUCLIER);
//		minus.sEquiper(Equipement.CASQUE);
//		
//	}

}
