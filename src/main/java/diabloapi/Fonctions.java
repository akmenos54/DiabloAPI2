package diabloapi;

import java.text.Normalizer;
import java.util.ArrayList;

public class Fonctions {
	
	public static ArrayList<Item> init() {
		
		ArrayList<Item> liste = new ArrayList();
		liste.add(new Item("Couronne de Léoric",  "Les effets de toute gemme enchâssée dans cet objet sont augmentés de [75 - 100]%. Ne s’applique pas aux gemmes légendaires.", "Casque Légendaire", "Aucune", 1));
		liste.add(new Item("Capuche de cherchemort",  "Quand vous êtes touché par un ennemi mort-vivant, vous avez 19% de chances de l’envoûter pendant 2 secondes [15 - 20]%", "Casque Légendaire", "Aucune", 1));
		liste.add(new Item("Visage de Gunes",  "Vendetta gagne les effets de la rune Cœur noir (Chasseur de démons uniquement)", "Casque Légendaire", "Chasseur de démons", 1));
		liste.add(new Item("Anneau des flammes infernales",  " Quand vous touchez un ennemi, vous avez une chance de recouvrir le sol de lave, ce qui inflige 200% des dégâts de votre arme pendant 6 secondes", "Anneau Légendaire", "Aucune", 0));
		liste.add(new Item("Manchettes",  "Aucun", "Brassards", "Aucune", 0));
		liste.add(new Item("Protège-bras sanguinaires",  "Quand vous êtes touché, vous avez une chance d’infliger 1000% des dégâts d’Épines aux ennemis proches", "Brassards Légendaire", "Aucune", 0));
		liste.add(new Item("Gant du culte",  "Les effets des sanctuaires durent 10 minutes", "Gant Légendaire", "Aucune", 0));
		liste.add(new Item("Gantelets moribonds",  "Votre golem produit un cadavre chaque seconde (Nécromancien uniquement)", "Gant Légendaire", "Nécromancien", 0));
		liste.add(new Item("Gantelets de gladiateur",  "Lorsqu’un massacre vous a fait bénéficier d’un bonus, il pleut de l’or", "Gant Légendaire", "Aucune", 0));
		return liste;
	}
	
	public static String convertStr(String str) {
		String str2 = str.trim();
		str2 = str2.replaceAll("\\s+","");
		str2 = str2.toLowerCase();
		str2 = str2.replaceAll("[-+.^:,!$*°)(_]","");
		String convertedString = Normalizer.normalize(str2, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		
		return convertedString;
	}

	public static ArrayList<Item> search(ArrayList<Item> base, String str) {
		
		String searchStr = convertStr(str);
		ArrayList<Item> liste = new ArrayList();
		
		for (int i = 0 ; i < base.size(); i++) {
			//if(searchStr.equals(convertStr(base.get(i).getName() )))
			if(convertStr(base.get(i).getName()).contains(searchStr) )
				liste.add(base.get(i));
			
		}
		
		return liste;
	}

}
