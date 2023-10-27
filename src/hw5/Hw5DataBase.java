package hw5;

import java.util.Arrays;

public class Hw5DataBase {

	public void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

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