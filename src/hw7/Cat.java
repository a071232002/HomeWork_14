package hw7;

public class Cat extends Animal {

	public Cat() {
		super();
	}
	
	public Cat(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
