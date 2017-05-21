
public class Point {
	//Attributs
	private double x,y,z;
	
	//constructeurs
	public Point(){
		this(0.0,0.0,0.0);
	}
	public Point(double x, double y, double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	
	//Methodes
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double Z) {
		this.z = z;
	}
}
