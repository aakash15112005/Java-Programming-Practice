package interface_practise;

interface Payment{
	double min_amount=100.0;
	
	double makePayment(double amount);

}
class onlinePayment implements Payment{
	public double makePayment(double amount) {
		if(amount>=min_amount) {
			System.out.println("Payment Successful");
			return amount;
		}
		else {
			System.out.println("Minimum payment amount is 100.0");
			return amount;
		}
	}
}
public class PaymentConstantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		onlinePayment op = new onlinePayment();
		op.makePayment(500.0);
		op.makePayment(50.0);
	}

}
