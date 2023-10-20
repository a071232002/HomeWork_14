package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形，如圖示結果：
//		(進階功能：加入直角三角形的判斷)

		checkType();

//		請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息，如圖示結果：
//		(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案) 

		guess0_9();
		guess0_100();

//		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數，如圖：
//		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

		selectRandom6WithoutInput();

		sc.close();
	}

//	三角形判斷
	public static void checkType() {
		Scanner sc = new Scanner(System.in);
		double[] x = new double[3];
		System.out.println("請輸入三個數字");
		for (int i = 0; i < x.length; i++) {
			if (sc.hasNextDouble()) {
				x[i] = sc.nextDouble();
			}
		}
		Arrays.sort(x);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();

		double a = x[0];
		double b = x[1];
		double c = x[2];

		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("不是三角形");
		} else if (a + b <= c) {
			System.out.println("不是三角形");
		} else if (a == b && a == c) {
			System.out.println("正三角形");
		} else if (a == b || a == c || b == c) {
			System.out.println("等腰三角形");
		} else if (a * a + b * b == c * c) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}
		System.out.println("======================================");
	}

//	猜0~9整數
	public static void guess0_9() {
		Scanner sc = new Scanner(System.in);
		int num0_9 = (int) (Math.random() * 10);
		System.out.println("請猜0~9一個數字");
		while (true) {
			int guess = sc.nextInt();
			if (guess == num0_9) {
				System.out.println("答對了!答案就是" + num0_9);
				break;
			} else {
				System.out.println("猜錯囉");
			}
		}
		System.out.println("======================================");
	}

//	猜0~100整數
	public static void guess0_100() {
		Scanner sc = new Scanner(System.in);
		int num0_100 = (int) (Math.random() * 101);
		System.out.println("請猜0~100一個數字");
		while (true) {
			int guess = sc.nextInt();
			if (guess == num0_100) {
				System.out.println("答對了!答案就是" + num0_100);
				break;
			} else if (guess > num0_100) {
				System.out.println("猜錯囉，再小");
			} else {
				System.out.println("猜錯囉，往上");
			}
		}
		System.out.println("======================================");
	}

//	Q3整段程式碼設為一個方法, 也可將random6個號碼另外寫成方法, 可顯示多組亂數選號

	public static void selectRandom6WithoutInput() {
		Scanner sc = new Scanner(System.in);
		int[] numSelect = new int[49];
		int count = 0;
		int numHate = 0;

		System.out.println("阿文...請輸入你討厭哪個數字？");
		for (int i = 0; i < 1;) {
			if (sc.hasNextInt()) {
				numHate = sc.nextInt();
				if (numHate >= 1 && numHate <= 9) {
					i++;
				}
				System.out.println("輸入錯誤, 請重新輸入1~9之間的數字");
				continue;
			}
		}

		for (int i = 1; i <= 49; i++) {
			if (i % 10 != numHate && i / 10 % 10 != numHate) {
				numSelect[count] = i;
				count++;
				if (count % 6 == 0) {
					System.out.print(numSelect[count - 1] + "\t");
					System.out.println();
				} else {
					System.out.print(numSelect[count - 1] + "\t");
				}
			}
		}
		System.out.println("總共" + count + "個");
		System.out.println("======================================");

//		顯示隨機選6個號碼不重覆結果: 若要產生多組選號, 需將以下另外寫成方法
		int[] numRandom = new int[6];

		for (int i = 0; i < 6; i++) {
			numRandom[i] = (int) (Math.random() * count);
			for (int j = 0; j < i; j++) {
				if (numRandom[i] == numRandom[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(numRandom);

		System.out.println("隨機選號為:");
		for (int i = 0; i < 6; i++) {
			System.out.print(numSelect[numRandom[i]] + " ");
		}
	}

}

//	**********************************************************************************
//	**********************************************************************************
//	**********************************************************************************