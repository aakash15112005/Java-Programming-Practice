package interface_practise;

interface Vehicle2{
	abstract void start2();
	
	default void stop() {
		System.out.println("Vehicle stopped...");
		}
}
class Car2 implements Vehicle2{
	public void start2() {
		System.out.println("Car started...");
	}
	public void stop() {
		System.out.println("Car stopped safely...");
	}
}
public class DefaultMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 c= new Car2();
		c.start2();
		c.stop();
	}

}
