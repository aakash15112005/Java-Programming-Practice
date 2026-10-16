package Abstract_class;

abstract class Vehicle{
	String brand;
	Vehicle(String brand){
		this.brand=brand;
	}
	public abstract int calculateRental(int days); 
	public void displayBrand() {
		System.out.println("Brand name is "+brand);
	}
}
class Car1 extends Vehicle{
	Car1(String brand){
		super(brand);
	}
	public int calculateRental(int days) {
		return 2000 * days;
	}
}
class Bike1 extends Vehicle{
	Bike1 (String brand){
		super(brand);
	}
	public int calculateRental(int days) {
		return 500 * days;
	}
}
public class VehicalRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike1 b=new Bike1("Hero");
		Car1 c=new Car1("Honda");
		
		b.displayBrand();
		System.out.println("Rental cost is "+ b.calculateRental(3));
		c.displayBrand();
		System.out.println("Rental cost is "+c.calculateRental(3));
	}

}
