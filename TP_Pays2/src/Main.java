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
		//System.out.println(Pays.getCompteurPays());
		/*
		Capitale uneCapitale = new Capitale ("WashingtonDC", 85654827, 1000000);
		
		Ville ville1 = new Ville ("Breuillet", 45000, 450000);
		Ville ville2 = new Ville ("Paris", 44657, 95222);
		Ville ville3 = new Ville ("Marseille", 3, 785512);
		
		Pays desPays = new Pays();
		desPays.setNom("France");
		
		Pays deuxPays = new Pays();
		deuxPays.setNom("Espagne");
		
		unContinent.ajouterPays(desPays);
		unContinent.ajouterPays(deuxPays);
		
		desPays.ajouterUneVille(ville1);
		desPays.ajouterUneVille(ville2);
		desPays.ajouterUneVille(ville3);
		
		System.out.println(unContinent.toString()); 
	
	
		Pays pays1 = new Pays ("Etat-Unis", "Anglais", "Dollars", uneCapitale);
		
		
		//System.out.println(Pays.getCompteurPays());
		//System.out.println(pays1.toString());
		System.out.println("|-------Villes-------|");
		System.out.println(ville1.toString());
		System.out.println(ville2.toString());
		System.out.println(ville3.toString());
		*/
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
				System.out.println("Marquez le nom du continent voulu : ");
				String cont = clavier.nextLine();
				unContinent = new Continent(cont);
				break;
				
				
			case 2:
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
				break;
				
			case 3:
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
				break;
				
			case 4:
				System.out.println(unContinent.toString());
				break;
				
			case 5:
				System.out.println("Quitté.");
				break;
				
			default:
				System.out.println("yes");
				break;
				
			}
		}while(choix != 4);
			
			
	}

}
