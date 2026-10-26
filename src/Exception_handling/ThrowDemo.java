package Exception_handling;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 16;
		
		try {
				if (age<18){
					throw new ArithmeticException("Not eligible to vote");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
