package inheritance_practise;

class person1{
	String name;
	int age;
	
	person1(String n,int a){
		this.name=n;
		this.age=a;
	}
	void display() {
		System.out.println("my name is " + name + " and my age is " + age);
	}
}
class student1 extends person1{
	String name;
	int rollNo;
	
	student1(String n1,int r,String n,int a){
		super(n,a);
		
		this.name=n1;
		this.rollNo=r;
		}	
		void display() {
			super.display();
			System.out.println("name is " + this.name + " and roll number is " + this.rollNo);
		}
	
}

public class que_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student1 s1=new student1("aakash",62,"virat",21);
		s1.display();
	
	}

}
