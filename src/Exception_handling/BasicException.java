package Exception_handling;

public class BasicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		try {
			int c = a/b;
		}
		catch(Exception e) {
			System.out.println("Cannot divide by zero");
		}

		
	}

}
