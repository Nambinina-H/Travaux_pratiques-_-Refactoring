package iut.bad;

public class Femme extends Humain {
	   public Femme(String nom, String prenom, int age) {
	     super(nom, prenom, age);
	   	}
	   
	   public static void main(String[] args) {
		     Homme homme = new Homme("Homme", "Un", 25);
		     Femme femme = new Femme("Femme", "Une", 24);
		     femme.ami(homme, 100);
		   }
	}
