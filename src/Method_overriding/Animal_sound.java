package Method_overriding;

class animal{
	
	public void makeSound() {
		System.out.println("Animal makes a sound...");
	}
}
class cat extends animal{
	@Override
	public void makeSound() {
		System.out.println("Cat says meow...");
	}
}

public class Animal_sound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cat c = new cat();
		c.makeSound();
	}

}
