package Exception_handling;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {10,20,30};
		try {
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index error");
		}
	}

}
