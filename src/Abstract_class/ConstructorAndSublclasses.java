package Abstract_class;

abstract class Employee1{
	String name;
	Employee1(String name){
		this.name=name;
	}
	abstract public double calculateSalary();
	public void display() {
		System.out.println("Employee name is "+name);
	}
}
class FullTimeEmployee1 extends Employee1{
	public FullTimeEmployee1(String name) {
	super(name);
	}
	public double calculateSalary() {
		return 30000.0;
	}
}
class PartTimeEmployee1 extends Employee1{
	public PartTimeEmployee1(String name) {
		super(name);
	}
	public double calculateSalary() {
		return 80 * 200;
	}
}

public class ConstructorAndSublclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartTimeEmployee1 pt=new PartTimeEmployee1("Amit");
		FullTimeEmployee1 ft=new FullTimeEmployee1("Rahul");
		ft.display();
		System.out.println("Salary of Rahul is " + ft.calculateSalary());
		pt.display();
		System.out.println("Salary of Amit is " + pt.calculateSalary());
		
	}

}
