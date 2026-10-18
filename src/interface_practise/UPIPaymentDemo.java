package interface_practise;

interface Payment1{
	double pay(double amount);
	double refund(double amount);
}
class UPIPayment implements Payment1{
	public double pay(double amount) {
		System.out.println("Pay Amount : " + amount);
		return amount;
	}
	
	public double refund(double amount) {
		System.out.println("Refund Amount : " + amount );
		return amount;
	}
}

public class UPIPaymentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UPIPayment u = new UPIPayment();
		u.pay(1500.0);
		u.refund(500.0);
	}

}
