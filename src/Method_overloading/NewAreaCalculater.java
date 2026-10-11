package Method_overloading;

class AreaCalculator2{
	
	public int Area(int side) {
		return side * side;
	}
	public int Area(int length,int width) {
		return length * width;
	}
	public double Area(double radios) {
		return Math.PI * radios * radios;
	}
	public double Area(double base,double height, boolean IsTriangel) {
		if (IsTriangel == true){
			return 0.5 * base * height;
		}
		else {
			return 0;
		}
	}
}

public class NewAreaCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaCalculator2 ac = new AreaCalculator2();
		

		System.out.println("Area of Square is = " + ac.Area(5));
		System.out.println("Area of Rectangel is = " + ac.Area(10,4));
		System.out.println("Area of Circle is = " + ac.Area(7.0));	
		System.out.println("Area of Triangel is = " + ac.Area(10.0,6.0,true));
	}

}
