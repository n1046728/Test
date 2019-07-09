package TAIFEX_201001;

//第八題	
//Please design a polygon class as base, and then design a rectangle class and a triangle class
//that inherited from the polygon class. Next, please write a program to compute the area for each
//polygon. (Please use JAVA program) 10
 
public class TestInheritance {
	public static void main(String args[]) {
		Polygon rectangle = new Rectangle(10.0,5.0);
		Polygon triangle = new Triangle(5,10);
		System.out.println("rectangle area :"+rectangle.area());
		System.out.println("triangle area :"+triangle.area());
		
	}
}
abstract class Polygon{
	abstract double area();
}
class Rectangle extends Polygon{
	private double len;
	private double width;
	
	public Rectangle(double len ,double width) {
		this.len = len;
		this.width = width;
	}
	@Override
	double area() {
		return len * width;
	}
	
}

class Triangle extends Polygon{
	private double bottom ;
	private double high;
	
	public Triangle(double bottom ,double high) {
		this.high = high;
		this.bottom = bottom;
	}
	@Override
	double area() {
		return bottom*high*0.5;
	}
	
}

