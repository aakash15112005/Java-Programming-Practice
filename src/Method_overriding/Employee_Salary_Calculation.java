package Method_overriding;

class Employee2{
	public double calculateSalary(double salary) {
		return salary + (salary * 0.10);
	}
}
class Manager2 extends Employee2{
	@Override
	public double calculateSalary(double salary) {
		return salary + (salary * 0.20);
	}
}
public class Employee_Salary_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 e2 = new Employee2();
		Manager2 m2 = new Manager2();
		
		System.out.println("Employee salary is " + e2.calculateSalary(30000.0));
		System.out.println("Manager salary is " + m2.calculateSalary(30000.0));
	}

}
