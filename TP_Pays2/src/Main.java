import java.util.Scanner;

/**
 * Classe Main
 * @author Jeremy
 * @version 2.0
 *
 */
public class Main {
	
	private static Scanner clavier;
	public static void main(String[] args) {
		
		clavier = new Scanner(System.in);
		
		 Continent unContinent = null;
		 Pays desPays = null;
		int choix;
		 
		 do {
			System.out.println("\n{------Menu------}");
			System.out.println("Ajouter un continent : 1");
			System.out.println("Ajouter un pays : 2");
			System.out.println("Ajouter une ville : 3");
			System.out.println("Afficher un continent : 4");
			System.out.println("Quitter : 5");
			
			choix = clavier.nextInt();
			clavier.nextLine();
			
			switch(choix) {
			case 1:
				ajoutContinent(unContinent);
				break;
			case 2:
				ajoutPays(unContinent, desPays);
				break;
			case 3:
				ajoutVille(unContinent, desPays);
				break;
			case 4:
				affichageContinent(unContinent);
				break;
			case 5:
				System.out.println("Quitté.");
				break;
			default:
				System.out.println("Veuillez indiquer un des 5 choix.");
				break;
			}
		 }while(choix != 5);
			
			
	}
	public static void ajoutContinent(Continent unContinent) {
		System.out.println("Marquez le nom du continent voulu : ");
		String cont = clavier.nextLine();
		unContinent = new Continent(cont);
	}
	public static void ajoutPays(Continent unContinent, Pays desPays) {
		if(unContinent == null) {
			System.out.println("Veuillez d'abord ajouter un continent.");
		}
		else {
			System.out.println("Notez le nom du pays : ");
			String pay = clavier.nextLine();
			System.out.println("Notez la langue du pays : ");
			String lang = clavier.nextLine();
			System.out.println("Notez la monnaie du pays : ");
			String monn = clavier.nextLine();
			System.out.println("Voulez vous inserer une capitale ? : oui / non");
			String choice = clavier.nextLine();
			if (choice.equals("oui")) {
				System.out.println("Veuillez indiquer le nom de la capitale :");
				String cap = clavier.nextLine();
				System.out.println("Veuillez indiquer le nombre d'habitants de la capitale :");
				int nbHabit = clavier.nextInt();
				System.out.println("Veuillez indiquer la superficie de la capitale :");
				float superficie = clavier.nextInt();
				Capitale uneCapitale = new Capitale (cap, nbHabit, superficie);
				desPays = new Pays(pay, lang, monn, uneCapitale);
				unContinent.ajouterPays(desPays);
			}
			else {
				desPays = new Pays(pay, lang, monn);
				unContinent.ajouterPays(desPays);
			}
		}
	}
	public static void ajoutVille(Continent unContinent, Pays desPays) {
		if(desPays == null) {
			System.out.println("Veuillez d'abord ajouter un pays.");
		}
		else {
			System.out.println("Notez le nom de la ville : ");
			String vil = clavier.nextLine();
			System.out.println("Entrez le nombre d'habitants : ");
			int nbHab = clavier.nextInt();
			System.out.println("Entrez la superficie : ");
			float sup = clavier.nextInt();
			Ville ville1 = new Ville (vil, nbHab, sup);
			desPays.ajouterUneVille(ville1);
		}
	}
	public static void affichageContinent(Continent unContinent) {
		System.out.println(unContinent.toString());
	}

}
