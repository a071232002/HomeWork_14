package hw9;

public class TaskOne implements Runnable {
	int count = 0;
	String name;
	static boolean ready = false;

	public TaskOne() {

	}

	public TaskOne(String name) {
		this.name = name;
	}

	public void run() {
		while(!ready) {
			
		}
		while (count < 10) {
			count++;
			System.out.println(name + "吃第" + count + "碗飯");
			try {
				long r = (long) (Math.random() * 2501) + 500;
				Thread.sleep(r);
			} catch (Exception e) {
			}
		}
		System.out.println(name + "吃完了!");
	}

	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始!------");
//		TaskOne p1 = new TaskOne("饅頭人");
//		Thread t1 = new Thread(p1);
//		TaskOne p2 = new TaskOne("詹姆士");
//		Thread t2 = new Thread(p2);
		Thread t1 = new Thread(new TaskOne("饅頭人"));
		Thread t2 = new Thread(new TaskOne("詹姆士"));
		t1.start();
		t2.start();
		TaskOne.ready = true;
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束!------");
	}
}
