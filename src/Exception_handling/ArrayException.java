package Exception_handling;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,20,30};
		try {
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid array index");
		}
	}

}
