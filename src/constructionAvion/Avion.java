package constructionAvion;

public class Avion {
	//propriétés
	private int id;
	private String marque;
	private double vitesse;
	private int puissance;
	public static int count;
	
	//constructeur vide initialisé
	public Avion(){
		id = ++count;
		marque = "";
		vitesse = 00.00;
		puissance = 0;	
	}
	public Avion(String marque, double vitesse, int puissance){
		id = ++count;
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
	}
	
	//
}
