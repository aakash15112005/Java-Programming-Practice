package Exception_handling;


public class ThrowsDemo {
	static void checkAge(int age) throws ArithmeticException{
			if(age<18) {
				throw new ArithmeticException("Not eligible...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(16);
		}

		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	
	}
}


