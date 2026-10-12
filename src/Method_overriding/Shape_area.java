package Method_overriding;

class Shape{
	
	public double calculateArea() {
		System.out.println("Calculating area of shape...");
		return 0;
	}
}
class circle extends Shape{
	@Override
		
	public double calculateArea() {
		return Math.PI * 5 * 5;
	}
	
}

public class Shape_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		circle c = new circle();
		System.out.println("Area of circle is " + c.calculateArea());
	}

}
