package ex2_interface2_motion;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
//		宣告簡化至下列set方法內
//		Attack a1 = new AttackSwingSword();
//		Attack a2 = new AttackShootArrow();
//		Move m = new MoveRun();
//		Defend d = new DefendDefensivePosture();
//		
//		saber.setAttack(a1);
//		saber.setMove(m);
//		saber.setDefend(d);
//		
//		archer.setAttack(a2);
//		archer.setMove(m);
//		archer.setDefend(d);
		
		saber.setAttack(new AttackSwingSword());
		saber.setMove(new MoveRun());
		saber.setDefend(new DefendDefensivePosture());
		
		archer.setAttack(new AttackShootArrow());
		archer.setMove(new MoveRun());
		archer.setDefend(new DefendDefensivePosture());
		
		saber.showStates();
		saber.showMotion();
		System.out.println("==========================");
		archer.showStates();
		archer.showMotion();
	}

}
