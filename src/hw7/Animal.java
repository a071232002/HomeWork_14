package hw7;

import java.io.Serializable;

public class Animal implements Serializable {
	
	private static final long serialVersionUID = 1L;
	protected String name;
	
	public Animal() {

	}

	public Animal(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void speak() {

	}
}
