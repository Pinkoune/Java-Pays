import java.util.ArrayList;

/**
 * Classe Pays
 * @author Jeremy
 * @version 1.0
 */
public class Pays {
	
	//Attributs
	/**
	 * Attributs
	 * @return
	 */
	
	private String nom;
	private String langue;
	private String monnaie;
	private Capitale saCapitale;
	private ArrayList <Ville> lesVilles;
	private static int compteurPays = 0;
	
	//Constructeurs
	/**
	 * Constructeurs
	 * @return
	 */
	
	public Pays() {
		this.lesVilles = new ArrayList <Ville>();
	}
	
	public Pays(String unNom, String uneLangue, String uneMonnaie, Capitale uneCapitale) {
		this.lesVilles = new ArrayList <Ville>();
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.saCapitale = uneCapitale;
		compteurPays = compteurPays +1;
	}
	
	public Pays(String unNom, String uneLangue, String uneMonnaie) {
		this.lesVilles = new ArrayList <Ville>();
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		compteurPays = compteurPays +1;
	}
	
	//Accesseurs
	/**
	 * Accesseurs
	 * @return
	 */
	
	public String getNom() {
		return this.nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public static int getCompteurPays() {
		return compteurPays;
	}
	/**
	 * Accesseur saCapitale get et set
	 * @return
	 */
	public Capitale getCapitale() {
		return this.saCapitale;
	}
	public void setCapitale(Capitale uneCapitale) {
		this.saCapitale = uneCapitale;
	}
	/**
	 * Methode pour choper la liste des villes
	 * @param uneVille
	 */
	
	public ArrayList<Ville> getListeVilles(){
		return this.lesVilles;
	}
	
	/**
	 * Methode pour ajouter une ville
	 * @param uneVille
	 */
	public void ajouterUneVille(Ville uneVille) {
		this.lesVilles.add(uneVille);
	}
	
	/**
	 * Methode pour rechercher une ville
	 * @param unNom
	 * @return
	 */
	public String rechercherUneVille(String unNom) {
		int index = 0;
		String result = "\nCette ville n'est pas presente.";
		while( index < lesVilles.size() && !unNom.equals(this.lesVilles.get(index).getNom())) {
			index = index + 1;
		}
		if (index < this.lesVilles.size()) {
			result = "\nVoici la ville recherch�e :" + unNom  + this.lesVilles.get(index).toString();
		}
		return result;
	}
	
	public int rechercheInt(String unNom) {
		int index = 0;
		int result = -1;
		while(index < this.lesVilles.size() && !this.lesVilles.get(index).getNom().equals(unNom)) {
			index = index + 1;
		}
		if (index < this.lesVilles.size()) {
			result = index;
		}
		return result;
	}
	
	/**
	 * Methode pour supprimer une ville
	 * @param indice
	 */
	public void supprimerUneVille(int indice) {
     	 this.lesVilles.remove(indice);
   }
	
	public void supprimer(Ville uneVille) {
		this.lesVilles.remove(uneVille);
	}
	
	public boolean supprimer(String unNom) {
		boolean rep = false;
		int index = this.rechercheInt(unNom);
		if (index != -1) {
			this.lesVilles.remove(index);
			rep = true;
		}
		return rep;
	}
	
	//toString
	/**
	 * toString
	 * @return
	 */
	
	public String toString() {
		String result = "\n|-------Pays-------|\n";
		if (this.nom != null) {
			result += "\nNom pays : " + this.nom;
		}
		if (this.langue != null) {
			result += "\nLangue : " + this.langue;
		}
		if (this.monnaie != null) {
			result += "\nMonnaie : " + this.monnaie;
		}
		if (this.saCapitale != null) {
			result += "\nCapitale : " + this.saCapitale.getNom();
		}
		if (this.lesVilles != null) {
			for(Ville uneVille : this.lesVilles)
				result += "\nVille : " + uneVille.toString();
		}
		return result;
	}

}
