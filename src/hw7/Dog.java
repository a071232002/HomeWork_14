package hw7;

public class Dog extends Animal {

	public Dog() {
		super();
	}
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
