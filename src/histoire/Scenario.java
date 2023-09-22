package histoire;

import personnages.Druide;
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
		Gaulois obelix = new Gaulois("Obélix",25);
		Romain minus = new Romain("minus", 6);
		Druide panoramix = new Druide("panoramix", 5, 10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.nextInt(panoramix, 10); 
		panoramix.booster(panoramix, obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste");
		panoramix.booster(panoramix, asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
