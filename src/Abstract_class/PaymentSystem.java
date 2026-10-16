package Abstract_class;

abstract class Payment{
	double amount;
	Payment(double amount){
		this.amount=amount;
	}
	public abstract void processPayment(); 
	public void Display() {
		System.out.println("Payment amount is "+amount);
	}
}
class UPIPayment extends Payment{
	UPIPayment(double amount){
		super(amount);
	}
	public void processPayment() {
		System.out.println("Payment processed using UPI");
	}
}
class CardPayment extends Payment{
	CardPayment(double amount){
		super(amount);
	}
	public void processPayment() {
		System.out.println("Payment processed using Card");
	}
}

public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CardPayment cp = new CardPayment(2500.0);
		UPIPayment up = new UPIPayment(1500.0);
		
		up.Display();
		up.processPayment();
		cp.Display();
		cp.processPayment();
		
	}

}
