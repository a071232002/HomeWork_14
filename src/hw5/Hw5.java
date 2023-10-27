package hw5;

import java.util.Arrays;

public class Hw5 {

	public static void main(String[] args) {
		Hw5DataBase q1 = new Hw5DataBase();
		Hw5DataBase q2 = new Hw5DataBase();
		Hw5DataBase q3 = new Hw5DataBase();
		Hw5DataBase q5 = new Hw5DataBase();

		q1.starSquare(5, 4);
		System.out.println("===========================");

		q1.randAvg();
		System.out.println("===========================");

		int[][] x = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] y = { { 1.2, 4.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println(q3.maxElement(x));
		System.out.println(q3.maxElement(y));
		System.out.println("===========================");

		System.out.println("本次隨機產生驗證碼為:");
		System.out.println(q5.genAuthCode());
	}
}
