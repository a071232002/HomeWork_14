package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		int x, y;
		while (true) {
			try {
				System.out.println("請輸入x的值:");
				x = sc.nextInt();
				System.out.println("請輸入y的值:");
				y = sc.nextInt();
				c.powerXY(x, y);
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("輸入的格式不正確");
				sc.nextLine();
			}
		}
		sc.close();
	}
}