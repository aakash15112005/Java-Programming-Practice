package Exception_handling;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		try {
			int result = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled...");
		}
		finally {
			System.out.println("Finally block executed");
		}
	}

}
