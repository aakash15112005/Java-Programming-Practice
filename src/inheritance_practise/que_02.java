package inheritance_practise;

class vehical{
	String brand;
	
	vehical(String b){
		this.brand=b;
	}
	
	public void display() {
		System.out.println("brand is " + brand);
	}
}
class car extends vehical{
	String model;
	
	car(String b,String m){
		super(b);
		this.model=m;
	}
	
	public void display() {
		 super.display();
		 System.out.println("model is " + model);
	}
}

public class que_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car c1=new car("toyota","fortuner");
		
		c1.display();
	}

}
