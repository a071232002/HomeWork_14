package hw9;

public class TaskTwo {

	public static void main(String[] args) {
		Account account = new Account();
		Mom mom = new Mom(account);
		Son son = new Son(account);
		mom.start();
		son.start();
	}
}

class Account {
	private int blance = 0;
	static boolean finished = false;

	synchronized public void deposit(int money) {
		if (!finished) {
			while (blance > 3000) {
				System.out.println("媽媽看到餘額在3000以上, 暫停匯款");
				try {
					wait();
					System.out.println("媽媽被熊大要求匯款!");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			blance += money;
			System.out.println("媽媽存了" + money + ", 帳戶共有 : " + blance);
			notify();
		}
	}

	synchronized public void withdrawal(int money) {
		while (blance < 1000) {
			System.out.println("熊大看到帳戶沒錢, 暫停提款");
			try {
				wait();
				System.out.println("熊大被老媽告知帳戶已經有錢了!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		blance -= money;
		System.out.println("熊大領了" + money + ", 帳戶共有 : " + blance);
		if (blance <= 2000) {
			System.out.println("熊大看到餘額在2000以下, 要求匯款");
			notify();
		}
	}
}

class Mom extends Thread {
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.deposit(2000);
		}
		System.out.println("老媽告知熊大領10次囉, 吃自己吧!");
	}
}

class Son extends Thread {
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.withdrawal(1000);
		}
		account.finished = true;
		System.out.println("熊大已經領10次, 完了!");
	}

}
