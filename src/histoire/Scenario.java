package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		
//		Le gaulois Astérix : « Bonjour à tous»
//		Le romain Minus : « UN GAU... UN GAUGAU...»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « Aïe»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « Aïe»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « J'abandonne...»

		Gaulois asterix = new Gaulois("Astérix",8);

		Romain minus = new Romain("minus", 6);

		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
