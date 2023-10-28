package hw5;

import java.util.Arrays;

public class Hw5 {

	public static void main(String[] args) {
		Hw5DataBase q1 = new Hw5DataBase();
		Hw5DataBase q2 = new Hw5DataBase();
		Hw5DataBase q3 = new Hw5DataBase();
		Hw5DataBase q5 = new Hw5DataBase();

//		• 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//		圖：

		q1.starSquare(5, 4);
		System.out.println("===========================");

//		• 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：

		q2.randAvg();
		System.out.println("===========================");

//		• 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//		可以找出二維陣列的最大值並回傳，如圖：

		int[][] x = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] y = { { 1.2, 4.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println(q3.maxElement(x));
		System.out.println(q3.maxElement(y));
		System.out.println("===========================");

//		• 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//		genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//		與數字的亂數組合，如圖：

		System.out.println("本次隨機產生驗證碼為:");
		System.out.println(q5.genAuthCode());
	}
}
