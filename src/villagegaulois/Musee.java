package villagegaulois;

import personnages.Equipement;
import personnages.Gaulois;

public class Musee {
	
	private Equipement[] museeTrophees = new Equipement[200];
	private int nbTrophees = 0;
	private Gaulois donneur;

	public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
		this.museeTrophees[nbTrophees] = equipement;
		this.donneur = gaulois;
	}
	
	public void extraireInstructionsCaml() {
		System.out.println("let musee = [");
		for (int i = 0; i <museeTrophees.length ; i ++) {
			Equipement equipement = museeTrophees[i];
			 System.out.println(donneur.getNom() + equipement);
		}
		System.out.println("]\n");
	}
	
	
//	Définir la méthode “extraireInstructionsCaml” qui retourne sous la forme d’une
//	chaîne de caractères la déclaration OCaml de la variable OCaml “musee” contenant
//	la liste des couples de chaîne de caractères (nom du gaulois, nom du trophée) pris
//	dans la variable Java “trophees”.
//	On retournera par exemple la chaîne de caractères contenant le texte suivant :
//	let musee = [
//	"Astérix", "bouclier";
//	"Astérix", "casque";
//	"Astérix", "casque"
//	]
//	Dans un TP de OCaml vous devrez traiter cette chaîne afin d’obtenir le nombre de
//	casques que le musée possède pour chacun des gaulois.

}
