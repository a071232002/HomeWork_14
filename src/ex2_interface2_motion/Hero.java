package ex2_interface2_motion;

public class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	private Attack attack;
	private Move move;
	private Defend defend;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	public void showStates() {
		System.out.print(name+" "+level+" "+exp);
		System.out.println();
	}
	public void showMotion() {
		attack.attack();
		move.move();
		defend.defend();
	}
	
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	public void setMove(Move move) {
		this.move = move;
	}
	public void setDefend(Defend defend) {
		this.defend = defend;
	}
	
	public void attack() {
		attack.attack();
	}
	
	public void move() {
		move.move();
	}
	
	public void defend() {
		defend.defend();
	}
	
}
