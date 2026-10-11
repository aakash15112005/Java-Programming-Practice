package Method_overloading;

class paymentCalculater{
	
	public int calculatePayment(int amount) {
		return amount;
	}
	public int calculatePayment(int amount,int tax) {
		return amount + tax;
	}
	public double calculatePayment(double amount,double discount) {
		return amount - discount;
	}
	public int calculatePayment(int amount,int tax,int deliveryCharge){
		return amount + tax + deliveryCharge;
	}
}

public class payment_calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		paymentCalculater pc = new paymentCalculater();
		
		System.out.println("Payment is = " + pc.calculatePayment(1000));
		System.out.println("Payment with tax is = " + pc.calculatePayment(1000,100));
		System.out.println("Payment after discount is = " + pc.calculatePayment(1000.0,100));
		System.out.println("total Payment is = " + pc.calculatePayment(1000,100,50));
		
	}

}
