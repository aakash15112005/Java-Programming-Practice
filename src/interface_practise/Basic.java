package interface_practise;

interface Vehicle{
	public void start();
}
class Car implements Vehicle{
	public void start() {
		System.out.println("Car start with the key...");
	}
}

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.start();
	}

}
