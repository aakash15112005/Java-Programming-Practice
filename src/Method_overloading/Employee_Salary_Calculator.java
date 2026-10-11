package Method_overloading;

class employee{
	
	public double calculateSalary(double salary) {
		return salary;
	}
	public double calculateSalary(double salary,double bonus) {
		return salary + bonus;
	}
	public double calculateSalary(double salary,double bonus,double allowances) {
		return salary + bonus + allowances;
	}
}

public class Employee_Salary_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee emp=new employee();
		
		System.out.println("Salary with basic salary is = " + emp.calculateSalary(20000.0));
		System.out.println("Salary with bonus is = " + emp.calculateSalary(20000.0,5000.0));
		System.out.println("Salary with bonus and allowances is = " + emp.calculateSalary(20000.0,5000.0,2000.0));
	
	}

}
