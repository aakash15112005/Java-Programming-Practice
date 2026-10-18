package interface_practise;

interface Vehicle1{
	void start();
}
class Car1 implements Vehicle1{
	public void start() {
		System.out.println("Car start with the key...");
	}
}
class Bike1 implements Vehicle1{
	public void start() {
		System.out.println("Bike start with a self start button...");
	}
}

public class VehicleInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bike1 b=new Bike1();
		//Car1 c= new Car1();
		
		//c.start();
		//b.start();
		
		Vehicle1 v = new Car1();
		v.start();
		Vehicle1 v1 = new Bike1();
		v1.start();
	}

}
