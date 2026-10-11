package Method_overloading;

class calculater1{

	public int add(int a,int b) {
		return a + b;
	}
	public int add(int a,int b,int c) {
		return a + b + c;
	}
	public double add(double a,double b) {
		return a + b;
	}
}

public class calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculater1 cal=new calculater1();
		System.out.println("Sum of two integers is = " + cal.add(10,20));
		System.out.println("Sum of three integers is = " + cal.add(10, 20, 30));
		System.out.println("Sum of two doubles is =" +cal.add(10.5, 20.5));

	}

}
