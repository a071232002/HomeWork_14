package hw9;

public class TaskTwoImprove {

	public static void main(String[] args) {
		Account2 account = new Account2();
		Mom2 mom = new Mom2(account);
		Son2 son = new Son2(account);
		mom.start();
		son.start();
	}
}

class Account2 {
	private int blance = 0;
	static boolean finished = false;

	synchronized public void give(int money, int baseLine) {
		while (blance > baseLine) {
			System.out.println("媽媽看到餘額在" + baseLine + "以上, 暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (!finished) {
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			blance += money;
			System.out.println("媽媽存了" + money + ", 帳戶共有 : " + blance);
		}
		notify();
	}

	synchronized public void take(int money, int baseLine) {
		while (blance < money) {
			System.out.println("熊大看到帳戶沒錢, 暫停提款");
			System.out.println("媽媽被熊大要求匯款!");
			try {
				wait();
				System.out.println("熊大被老媽告知帳戶已經有錢了!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		blance -= money;
		System.out.println("熊大領了" + money + ", 帳戶共有 : " + blance);
		if (blance <= baseLine) {
			System.out.println("熊大看到餘額在" + baseLine + "以下, 要求匯款");
			notify();
		}
	}
}

class Mom2 extends Thread {
	Account2 account;

	public Mom2(Account2 account) {
		this.account = account;
	}

	public void run() {
		if (!account.finished) {
			for (int i = 1; i <= 10; i++) {
				account.give(2000, 3000);
			}
			account.finished = true;
			System.out.println("老媽告知熊大領10次囉, 吃自己吧!");
		}
	}
}

class Son2 extends Thread {
	Account2 account;

	public Son2(Account2 account) {
		this.account = account;
	}

	public void run() {
		if (!account.finished) {
			for (int i = 1; i <= 10; i++) {
				account.take(1000, 2000);
			}
			account.finished = true;
			System.out.println("熊大已經領10次, 完了!");
		}
	}
}