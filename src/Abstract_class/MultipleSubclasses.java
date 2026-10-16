package Abstract_class;

abstract class Shape{
	abstract public double calculateArea();
	public void display() {
		System.out.println("Calculating Area...");
	}
}
class Rectangle extends Shape{
	double length=10.0,width=5.0;
	public double calculateArea() {
		return length * width;
	}
}
class Circle extends Shape{
	double radius=7.0;
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
public class MultipleSubclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c= new Circle();
		Rectangle r = new Rectangle();
		c.display();
		System.out.println("Rectangle Area is "+r.calculateArea());
		c.display();
		System.out.println("Circle Area is "+c.calculateArea());
		
	}

}
