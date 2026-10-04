package inheritance_practise;

class employee{
	String name="employee";
	
}
class manager extends employee{
	String name="manager";
	
	void display() {
		System.out.println("empployee name is "+super.name);
		System.out.println("manager name is " + this.name);
	}
}

public class que_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		manager m=new manager();
		m.display();
	}

}
