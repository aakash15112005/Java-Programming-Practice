package Method_overloading;

class ShoppingBill {
	
	public int calculateBill(int price) {
		return price;
	}
	public int calculateBill(int price,int quantity) {
		return price * quantity;
	}
	public double calculateBill(double price,int quantity,double discount) {
		return price * quantity - discount;
	}
	public double calculateBill(double price,int quantity,double discount,double tax) {
		return price * quantity - discount + tax;
	}
}

public class ShoppingBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShoppingBill sb = new ShoppingBill();
		
		System.out.println("Price of product is = " + sb.calculateBill(500));
		System.out.println("Subtotal is = " + sb.calculateBill(200,3));
		System.out.println("Price after Discount is = " + sb.calculateBill(250.0,4,100.0));
		System.out.println("Total amount is = " + sb.calculateBill(500.0,2,100.0,50.0));
	}

}
