package personnages;

public class Romain {

	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		assert force >= 0 : "La force d'un Romain doit être positive";
		this.force = force;
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
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		
		minus.parler("Aie");
		minus.recevoirCoup(3); 
	}

}
