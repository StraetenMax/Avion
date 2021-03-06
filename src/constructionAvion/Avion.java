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
	
	//accesseurs et mutateurs
	public int getId(){
		return id;
	}
	public void setId(){
		this.id = ++count;
	}
	public String getMarque(){
		return marque;
	}
	public void setMarque(String marque){
		this.marque  = marque;
	}
	public double getVitesse(){
		return vitesse;
	}
	public void setVitesse(double vitesse){
		this.vitesse = vitesse;	
	}
	public int getPuissance(){
		return puissance;
	}
	public void setPuissance(int puissance){
		this.puissance = puissance;
	}
	//les méthodes
	public String toString(){
		return "l'avion "+this.id+" de marque "+this.marque+", vitesse "+this.vitesse+" km/h et de puissance "+this.puissance;
	}
	public String description(){
		String str = "Avion "+this.getId()+" de marque "+this.getMarque()+" avec une vitesse de "+this.getVitesse()+" km/h et une puissance de"+this.getPuissance();
		return str;
	}
}
