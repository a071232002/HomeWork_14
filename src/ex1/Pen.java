package ex1;

public abstract class Pen {
	protected String brand;
	protected double price;

	public Pen() {
		this.brand = "";
		this.price = 100;
	}

	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public abstract void write();
}
