package Abstract_class;

abstract class Animal{
	abstract public void sound();
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog Barks...");
		}
}

public class Basic_prg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		d.sound();
	}

}
