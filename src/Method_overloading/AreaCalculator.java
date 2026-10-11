package Method_overloading;

class AreaCalculator1{
	
	public int area(int side) {
		return side * side;
	}
	public int area(int length,int width) {
		return length * width;
	}
	public double area(double radios) {
		return radios * radios * Math.PI;
	}
}

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaCalculator1 ac = new AreaCalculator1();
		
		System.out.println("Area of sum is = " + ac.area(5));
		System.out.println("Area of rectangel is = " + ac.area(10,4));
		System.out.println("Area of circle is = " + ac.area(3.0));
	}

}
