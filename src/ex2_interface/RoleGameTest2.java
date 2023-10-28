package ex2_interface;

public class RoleGameTest2 {

	public static void main(String[] args) {
		Hero2 saber = new Hero2("亞拉岡", 1, 0);
		Hero2 archer = new Hero2("勒苟拉斯", 1, 0);
		SwordMan2 s = new SwordMan2();
		ArrowMan2 a = new ArrowMan2();

		saber.showStates();
		saber.setRole(s);
		saber.skill();
													
		System.out.println("==================");

		archer.showStates();
		archer.setRole(a);
		archer.skill();
	}

}
