package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形，如圖示結果：
//		(進階功能：加入直角三角形的判斷)

		double[] x = new double[3];
		System.out.println("請輸入三個數字");
		for (int i = 0; i < x.length; i++) {
			if (sc.hasNextDouble()) {
				x[i] = sc.nextDouble();
			}
		}
		checkType(x[0], x[1], x[2]);

//		請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息，如圖示結果：
//		(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案) 

		guess0_9();
		guess0_100();

//		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數，如圖：
//		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

		System.out.println("輸入一個1~9，不想要的數字");
		int numInput = sc.nextInt();
		selectRandom6WithoutInput(numInput);

//		Q3嘗試判斷輸入值是否正確，錯誤則重新輸入
//		System.out.println("輸入一個1~9，不想要的數字");
//		int numInput = -1;
//		while (true) {
//			if (sc.hasNextInt()) {
//				numInput = sc.nextInt();
//				if (numInput >= 1 && numInput <= 9) {
//					break;
//				} else {
//					System.out.println("輸入值有誤, 請重新輸入");
//				}
//			}
//		}
		sc.close();
	}

//	三角形判斷
	public static void checkType(double x, double y, double z) {
		double[] t = { x, y, z};
		Arrays.sort(t);
		double a = t[0];
		double b = t[1];
		double c = t[2];
		System.out.print(a + "\t");
		System.out.print(b + "\t");
		System.out.print(c + "\t");
		System.out.println();
		if (a + b <= c) {
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

//	**********************************************************************************
//	********************************第3題使用的方法群*************************************
//	**********************************************************************************
//	取得排除input數字後的陣列
	public static int[] getNumWithoutInput(int numInput) {
		int count = 0;
		int[] numSelect = new int[getCountWihtoutInput(numInput)];

		for (int i = 1; i <= 49; i++) {
			if (i % 10 != numInput && i / 10 % 10 != numInput) {
				numSelect[count] = i;
				count++;
			}
		}
		return numSelect;
	}

//	取得排除input數字後的count數
	public static int getCountWihtoutInput(int numInput) {
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != numInput && i / 10 % 10 != numInput) {
				count++;
			}
		}
		return count;
	}

//	母數0~(n-1), 依序隨機抽樣6個數字存入new陣列, 若重複則重抽 => for 亂數抽取陣列索引值
	public static int[] numrandom(int numSample) {
		int[] numrandom = new int[6];
		for (int i = 0; i < 6; i++) {
			numrandom[i] = (int) (Math.random() * numSample);
			for (int j = 0; j < i; j++) { // 已存入抽樣數的x[j], 依序與當前抽樣的x[i]做比對
				if (numrandom[j] == numrandom[i]) {
					i--;
					break;
				}
			}
		}
		return numrandom;
	}

//	排除輸入數字後, print剩餘數字及共幾個, 並顯示隨機取樣6個數字
	public static void selectRandom6WithoutInput(int numInput) {
		int[] x = numrandom(getCountWihtoutInput(numInput));
		Arrays.sort(x);
		int[] numSelect = getNumWithoutInput(numInput);
		for (int i = 0; i < getCountWihtoutInput(numInput); i++) {
			if ((i + 1) % 6 == 0) {
				System.out.print(numSelect[i] + "\t");
				System.out.println();
			} else {
				System.out.print(numSelect[i] + "\t");
			}
		}
		System.out.println("總共" + getCountWihtoutInput(numInput) + "個");
		System.out.println("======================================");
		System.out.println("隨機選號為:");
		for (int i = 0; i < 6; i++) {
			System.out.print(numSelect[x[i]] + " ");
		}
	}
}
//	**********************************************************************************
//	**********************************************************************************
//	**********************************************************************************
