package inheritance_practise;

class person{
	int age;
	String name;
	
	person(int a,String n){
		this.age=a;
		this.name=n;
	}
	public void DisplayPerson() {
		System.out.println("name is "+name + " and age is "+age);
	}
}
class student extends person{
	int rollNo;
	String course;
	student(int a,String n,int r, String c){
		super(a,n);
		
		this.rollNo=r;
		this.course=c;
		
	}
	public void displayStudent() {
		System.out.println("name is "+name + " and age is "+age +
							" roll number is "+rollNo + " and course is"+course);
	}
}

public class que_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1=new student(21,"aakash",62,"MCA");
		
		s1.DisplayPerson();
		s1.displayStudent();
	}

}
