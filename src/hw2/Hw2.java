package hw2;

public class Hw2 {
	public static void main(String[] args) {
		int a, b;
		
//		 • 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int evensum = 0;
		for (a = 1; a <= 1000; a++) {
			if (a % 2 == 0) {
				evensum += a;
			}
		}
		System.out.println("1～1000的偶數和 = " + evensum);
		System.out.println("============================");

//		 • 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int num1 = 1;
		for (a = 1; a <= 10; a++) {
			num1 *= a;
		}
		System.out.println("1～10的連乘積 = " + num1);
		System.out.println("============================");
		
//		 • 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int num2 = 1;
		a = 1;
		while (a <= 10) {
			num2 *= a;
			a++;
		}
		System.out.println("1～10的連乘積 = " + num2);
		System.out.println("============================");
		
//		 • 請設計一隻Java程式，輸出結果為以下：
//		 1 4 9 16 25 36 49 64 81 100
		for (a = 1; a <= 10; a++ ) {
			System.out.print(a*a + " ");
		}
		System.out.println();
		System.out.println("============================");
		
//		• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int count = 0;
		for ( a= 1; a <= 49; a++) {
			if (a % 10 != 4 && a / 10 != 4) {
				System.out.print(a+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有" + count + "個");
		System.out.println("============================");
		
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		for (a = 10; a >=10; a--) {
			for (b = 1; b <= a; b++) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		System.out.println("============================");
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		 A
//		 BB
//		 CCC
//		 DDDD
//		 EEEEE
//		 FFFFFF
		char c = 'A';
		for ( a= 1; a <= 6; a++) {
			for (b = 1; b <= a ; b++) {
				System.out.print(c);
			}
			System.out.println();
			c++;
		}
	}
}
