package hw5;

import java.util.Arrays;

public class Hw5DataBase {

//	• 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//	圖：
	
	public void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	• 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：	
	
	public void randAvg() {
		int[] numbers = new int[10];
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			numbers[i] = (int) (Math.random() * 101);
			sum += numbers[i];
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("平均值 = " + sum / 10);
	}

//	• 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳，如圖：

	public int maxElement(int[][] array) {
		int[][] x = array;
		int max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	
	public double maxElement(double[][] array) {
		double[][] x = array;
		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

//	• 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合，如圖：
	
	public String genAuthCode() {
		String s = "";
		char c1 = '0';
		char c2 = 'A';
		char c3 = 'a';
		for (int i = 1; i <= 8; i++) {
			int a1 = (int) (Math.random() * 3);
			switch (a1) {
			case 0:
				s += (char) (c1 + (int) ((Math.random() * 10)));
				break;
			case 1:
				s += (char) (c2 + (int) ((Math.random() * 26)));
				break;
			case 2:
				s += (char) (c3 + (int) ((Math.random() * 26)));
				break;
			}
		}
		return s;
	}
}