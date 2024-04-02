package iut.bad;

public class Humain {
	
	   protected String nom;
	   protected String prenom;
	   protected int age;

	   public Humain(String nom, String prenom, int age) {
	     this.nom = nom;
	     this.prenom = prenom;
	     this.age = age;
	   }
	   
	   @Override
	   public String toString() {
	     return "Nom: " + nom + ", Prenom: " + prenom + ", Age: " + age;
	   }
	   
	   public void details() {
	     System.out.println(this.toString());
	   }
	   
	   public void manger() {
		   }

	   public void boire() {
		   }
	   
	   public void ami(Humain autre, int duree) {
		     System.out.println(this.nom + " et " + autre.nom + " sont amis depuis " + duree + " jours.");
		   }
	}
