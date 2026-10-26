package Exception_handling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=0;
		try {
			try {
				System.out.println(a/b);
			}
			catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero...");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index...");
		}
	}

}
