package Exception_handling;

public class ExceptionPropagation {
	static void divide() throws ArithmeticException {
		int a=10;
		int b=0;
		int c=a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
		try {
			divide();
		}
		catch(ArithmeticException e){
			System.out.println("Exception cause in main");
		}
	}
	}
}
