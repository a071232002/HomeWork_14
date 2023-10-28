package ex2_interface;

public class Hero2 {
	// 省略 getter/setter...

	private String name;
	private int level;
	private double exp;
	private Role role;

	public Hero2() {
		this("David", 1, 0);
	}

	public Hero2(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void skill() {
		role.attack();
		role.move();
		role.defend();
	}

	public void showStates() {
		System.out.print(name + " " + level + " " + exp);
		System.out.println();
	}
}
