package Method_overloading;

class display1{
	
	public void display(int a) {
		System.out.println("this method uses integer");
	}
	public void display(double b) {
		System.out.println("this method uses double");
	}
	public void display(String s) {
		System.out.println("this method uses String");
		
	}
	public void display(int a,int b) {
		System.out.println("this methos uses 2 integers");
	}
}

public class display_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display1 dis = new display1();
		dis.display(5);
		dis.display(5.5);
		dis.display("aakash");
		dis.display(5,10);
		dis.display(10.5f);
	}
	

}
