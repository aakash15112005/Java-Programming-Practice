package Method_overriding;

class Employee1{
	public int calculateBonus() {
		return 2000;
	}
}
class Manager1 extends Employee1 {
	@Override
	public int calculateBonus() {
		return 5000;
	} 
}

public class Employee_Bonus_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager1 m1=new Manager1();
		Employee1 e1=new Employee1();
		
		System.out.println("Bonus of Employee is " + e1.calculateBonus());
		System.out.println("Bonus of Manager is " + m1.calculateBonus());
	}

}
