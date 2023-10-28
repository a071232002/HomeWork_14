package ex2_interface;

public class ArrowMan2 implements Role {

	@Override
	public void attack() {
		System.out.println("放弓箭");
	}

	@Override
	public void move() {
		System.out.println("跑步");
	}

	@Override
	public void defend() {
		System.out.println("做防禦動作");
	}
}
