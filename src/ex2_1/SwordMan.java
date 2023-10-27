package ex2_1;

public class SwordMan extends Hero {
	
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	@Override
	public void attack() {
		System.out.println("揮劍");
	}
	
}
