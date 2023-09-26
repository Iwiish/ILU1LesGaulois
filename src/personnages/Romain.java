package personnages;

public class Romain {

	private String nom;
	private int force;
	private Equipement equipement[];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		assert force >= 0 : "La force d'un Romain doit être positive";
		this.force = force;
		equipement = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() +  "« " + texte + "»");
	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force >= 0 : "La force d'un Romain doit être positive";
		int forceD = force;
		force -= forceCoup;
		int nvForce = force;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne");
		}
		assert nvForce < forceD : "La force du Romain doit avoir diminué";
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
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		
		minus.parler("Aie");
		minus.recevoirCoup(3); 
		
//		System.out.println(Equipement.CASQUE);
//		System.out.println(Equipement.BOUCLIER);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		
	}

}
