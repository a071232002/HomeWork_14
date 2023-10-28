package ex2_interface;

public class SwordMan2 implements Role {

	@Override
	public void attack() {
		System.out.println("揮劍");
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
