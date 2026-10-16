package Abstract_class;

abstract class Employee{
	String name;
	public Employee(String name){
		this.name=name;
	}
	abstract public double calculateSalary();
	public void display() {
		System.out.println("Employee name is "+name);
	}
}
class FullTimeEmployee extends Employee{
	public FullTimeEmployee(String name) {
		super(name);
	}
	public double calculateSalary() {
		return 30000.0;
		
	}
}
public class abstract_with_constructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FullTimeEmployee ft = new FullTimeEmployee("Rahul");
		ft.display();
		System.out.println("Salary is " + ft.calculateSalary());
	}

}
