package hw5;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		MyRectangle a = new MyRectangle();
		a.setWidth(10);
		a.setDepth(20);
		System.out.println(a.getArea());
		
		MyRectangle b = new MyRectangle(10,20);
		System.out.println(b.getArea());
	}
}
