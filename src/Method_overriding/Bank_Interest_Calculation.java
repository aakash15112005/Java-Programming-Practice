package Method_overriding;

class Bank{
	public double calculateInterest(double amount) {
		return amount * 0.05 ;
	}
}
class SBI extends Bank{
	@Override
	public double calculateInterest(double amount) {
		return amount * 0.07 ;
	}
}
public class Bank_Interest_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank();
		SBI s = new SBI();
		
		System.out.println("Bank interest is " + b.calculateInterest(10000.0));
		System.out.println("SBI interest is " + s.calculateInterest(10000.0));
	}

}
