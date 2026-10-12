package Method_overriding;

class Employee{
	
	public int calculateSalary(int salary) {
		return salary;
	}
}
class Manager extends Employee{
	@Override
	
	public int calculateSalary(int salary) {
		return salary;
	}
}

public class employee_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		System.out.println("Employee salary is " + e.calculateSalary(20000));
		
		Manager m = new Manager();
		System.out.println("Manager's salary is " + m.calculateSalary(50000));
	}

}
