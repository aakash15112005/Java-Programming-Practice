package this_practise;

class product{
	int id;
	String name;
	double price;
	
	product(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	 void updatePrice(double price){
		this.price=price;
	}
	 void display() {
		 System.out.println("id is "+id + " name is "+name+" price is "+price);
	 }
}

public class Que_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		product p1=new product(101,"aakash",500);
		product p2=new product(102,"virat",100);
		
		p1.display();
		p2.display();
		p2.updatePrice(1000);
		p2.display();
		
	}

}
