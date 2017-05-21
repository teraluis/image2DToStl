
public class Pixel {
	//Attributs
	private double z; //Equivalent à la hauteur,épaisseur de la plaque
	private Triangle t1,t2;
	
	//Constructeurs
	
	public Pixel(Triangle t1, Triangle t2, double z){
		this.z=z;
		this.t1=t1;
		this.t2=t2;
	}

	
	//Methodes

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
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
	
	public double compareZ(Pixel p){
		double x = z-p.getZ();
		if (x<0 || x>0) {
			return -1;
		}
		else { //Verifier le cas des arrondis
			return z;
		}

	}
}
