
public class Face {
	//Attributs
	private double valeur; //Equivalent à la hauteur,épaisseur de la plaque , au z des points
	private Triangle t1,t2; // t1 = abc t2 =bcd
	
	//Constructeurs
	
	public Face(Triangle t1, Triangle t2, double valeur){
		this.valeur=valeur;
		this.t1=t1;
		this.t2=t2;
	}

	
	//Methodes

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public Triangle getT1() {
		return t1;
	}

	public void setT1(Triangle t1) {
		this.t1 = t1;
	}

	public Triangle getT2() {
		return t2;
	}

	public void setT2(Triangle t2) {
		this.t2 = t2;
	}
	
	public double compareZ(Face p){
		double x = valeur-p.getValeur();
		if (x<0 || x>0) {
			return -1;
		}
		else { //Verifier le cas des arrondis
			return valeur;
		}

	}
}
