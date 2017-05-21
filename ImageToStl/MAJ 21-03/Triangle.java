
public class Triangle {
	//Attributs
	private Point a,b,c;
	
	//Constructeurs
	public Triangle(){
		Point a = new Point(0,0,0);
		Point b = new Point(0,0,0);
		Point c = new Point(0,0,0);
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public Triangle(Point a, Point b, Point c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	//Methode

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
		
	/*public boolean partagePoint(){
		
	}*/
	
	
	
	
}
