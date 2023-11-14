package hw10;

import static java.lang.System.out;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hw10 {

	public static void main(String[] args) {

//	• 請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
//	為質數 (提示：Math類別)
		TaskOne q1 = new TaskOne();

		List<Integer> list = q1.random(1, 100, 5);

		for (int i = 0; i < list.size(); i++) {
			q1.checkPrime(list.get(i));
		}

//	• 請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位
//	(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖 (提示： TestFormatter.java, Java API
//	文件, 判斷數字可用正規表示法)
		TaskTwo q2 = new TaskTwo();
		q2.showNumByType();

//	• 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成(1)
//	年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖

	}

}

class TaskOne {
	public List<Integer> random(int min, int max, int num) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			int r = (int) (Math.random() * (max - min)) + min;
			list.add(r);
		}
		Collections.sort(list);
		return list;
	}

	public void checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++)
			if (num % i == 0) {
				count++;
			}
		if (count == 2) {
			System.out.println(num + "是質數");
		} else {
			System.out.println(num + "不是質數");
		}
	}
}

class TaskTwo {

	public void showNumByType() {
//		"[0-9]+(\\.[0-9]+)?"
		Scanner sc = new Scanner(System.in);
		String regex = "^[0-9]*$";
		System.out.println("請輸入數字");
		String str = sc.next();
		while (!str.matches(regex)) {
			System.out.println("數字格式不正確, 請再輸入一次");
			str = sc.next();
		}
		Format dfm1 = new DecimalFormat("#,###.00");
		Format dfm2 = new DecimalFormat("##0.00%");
		Format dfm3 = new DecimalFormat("0.###E0");
		double num = Integer.parseInt(str); 
		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			out.println(dfm1.format(num));
			break;
		case 2:
			out.println(dfm2.format(num));
			break;
		case 3:
			out.println(dfm3.format(num));
			break;
		}

	}
}

class TaskThree {
	
}
