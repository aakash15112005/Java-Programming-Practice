package this_practise;

class student{
	int id;
	String name;
	int marks;
	
	student(int id,String name,int mark){
		this.id=id;
		this.name=name;
		this.marks=mark;
	}
	void display() {
		System.out.println("my id is " + id + ", my name is " + name + ", and marks is " + marks);
	}
}

public class Que_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1=new student(101,"aakash",50);
		student s2=new student(102,"virat",55);
		s1.display();
		s2.display();
	}

}
