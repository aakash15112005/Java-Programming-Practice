package Method_overriding;

class vehical{
	public void start() {
		System.out.println("Vehical is starting...");
	}
}
class bike extends vehical {
	@Override
	
	public void start() {
		System.out.println("Bike starts with a self-start button...");
	}
}

public class Vehical_start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bike b = new bike();
		b.start();
	}

}
