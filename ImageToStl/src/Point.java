
public class Point {
	//Attributs
	private double x,y;
	
	//constructeurs
	public Point(){
		this(0.0,0.0);
	}
	public Point(double x, double y){
		this.x=x;
		this.y=y;
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
}
