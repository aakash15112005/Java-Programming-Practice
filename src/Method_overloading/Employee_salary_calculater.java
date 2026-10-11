package Method_overloading;

class EmployeeSalary{
	
	public int calculateSalary(int basicSalary) {
		return basicSalary;
	}
	public int calculateSalary(int basicSalary,int bonus) {
		return basicSalary + bonus;
	}
	public double calculateSalary(double basicSalary,double bonus,double deduction) {
		return ( basicSalary + bonus ) - deduction;
	}
	public int calculateSalary(int basicSalary,int bonus,int allowance,int deduction) {
		return basicSalary + bonus + allowance - deduction;
	}
}

public class Employee_salary_calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeSalary es = new EmployeeSalary();
		
		System.out.println("Basic salary is = " + es.calculateSalary(50000));
		System.out.println("Salary with bonus is = " + es.calculateSalary(50000,5000));
		System.out.println("Salary after deduction is = " + es.calculateSalary(50000.0,5000.0,1000.0));	
		System.out.println("Total salary is = " + es.calculateSalary(50000,5000,2000,1000));
	
	}

}
