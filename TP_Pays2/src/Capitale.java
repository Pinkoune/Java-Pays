/**
 * Classe Capitale
 * @author jbarcelo
 *
 */
public class Capitale {
	
	//Attributs

	private String nom;
	private int nbHabitants;
	private float superficie;
	
	//Constructeurs
	
	public Capitale() {
		
	}
	
	public Capitale(String unNom, int unNbHabitants, float uneSuperficie) {
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
		this.superficie = uneSuperficie;
	}
	
	//Accesseurs
	
	public String getNom() {
		return this.nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public int getNbHabitants() {
		return this.nbHabitants;
	}
	public void setNbHabitants(int unNbHabitants) {
		this.nbHabitants = unNbHabitants;
	}
	
	public float getSuperficie() {
		return this.superficie;
	}
	public void setSuperficie(float uneSuperficie) {
		this.superficie = uneSuperficie;
	}
	
	//toString
	
	public String toString() {
		String result = "";
		if (this.nom != null) {
			result += "\nNom : " + this.nom;
		}
		if (this.nbHabitants != 0) {
			result += "\nNbHabitants : " + this.nbHabitants;
		}
		if (this.superficie != 0) {
			result += "\nSuperficie : " + this.superficie;
		}
		return result;
	}
}
