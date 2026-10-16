package Abstract_class;

abstract class Vehical{
	abstract public void start();
	public void stop() {
		System.out.println("Vehical stopped...");
	}
}
class Car extends Vehical{
	public void start() {
		System.out.println("Car starts with a key");
	}
}
class Bike extends Vehical{
	public void start() {
		System.out.println("Bike starts with a button");
	}
}

public class Vehical_starting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		Bike b = new Bike();
		c.start();
		c.stop();
		
		b.start();
		b.stop();
		
	}

}
