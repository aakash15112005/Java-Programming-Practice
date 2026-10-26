package Abstract_class;

abstract class Employee11{
	String name;
	Employee11(String name){
		this.name=name;
	}
	public abstract double calculateSalary();
	public void display() {
		System.out.println("Emplayee name is "+name);
	}
}
class FullTimeEmolayee11 extends Employee11{
	double monthlySalary;
	
	FullTimeEmolayee11 (String name,double monthlySalary){
		super(name);
		this.monthlySalary=monthlySalary;
	}
	public double calculateSalary() {
		return monthlySalary;
	}
}
class PartTimeEmployee extends Employee11{
	double hoursWorked,hourlyRate;
	
	PartTimeEmployee(String name,double hoursWorked,double hourlyRate){
	super(name);	
	this.hourlyRate=hourlyRate;
	this.hoursWorked=hoursWorked;
	}
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
}
public class EmployeePayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartTimeEmployee pe = new PartTimeEmployee("Amit",80,200);
		FullTimeEmolayee11 fe = new FullTimeEmolayee11("Rahul",30000.0);
		
		fe.display();
		System.out.println("Salary is " + fe.calculateSalary());
		pe.display();
		System.out.println("Salary is " + pe.calculateSalary());
	}

}
