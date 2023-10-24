package hw4;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

		Hw4db q1 = new Hw4db(29, 100, 39, 41, 50, 8, 66, 77, 95, 15);

		System.out.println("平均值 = " + q1.getAvg());
		q1.showOverAvg();
		System.out.println("=============================");

//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH

		Hw4db q2 = new Hw4db("Hello World");
		q2.showReverse();
		System.out.println("=============================");

//		有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 

		Hw4db q3 = new Hw4db("mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune");
		System.out.println("母音共有" + q3.getVowelCheck() + "個");
		System.out.println("=============================");

//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下：
//		員工編號	25		32		8		19		27
//		身上現金	2500	800		500		1000	1200

//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」

		Scanner sc = new Scanner(System.in);

		System.out.println("小華你想要多少？");

		int moneyYouWant = sc.nextInt();
		Hw4db q4 = new Hw4db(moneyYouWant);

		q4.setEmpno(25, 32, 8, 19, 27);
		q4.setCash(2500, 800, 500, 1000, 1200);
//		現金資訊比對用
//		q4.showCashTable();
		q4.moneyWhere();
		System.out.println("=============================");

//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

		System.out.println("請輸入西元年");
		int year = sc.nextInt();
		System.out.println("請輸入月份");
		int month = sc.nextInt();
		System.out.println("請輸入日期");
		int day = sc.nextInt();

		Hw4db q5 = new Hw4db(year, month, day);
		q5.dayOfYear();
		System.out.println("=============================");

//		班上有8位同學，他們進行了6次考試結果如下：
//			1	2	3	4	5	6	7	8
//		1考	10	35	40	100	90	85	75	70
//		2考	37	75	77	89	64	75	70	95
//		3考	100	70	79	90	75	70	79	90
//		4考	77	95	70	89	60	75	85	89
//		5考	98	70	89	90	75	90	89	90
//		6考	90	80	100	75	50	20	99	75
//		請算出每位同學考最高分的次數

//		分數表改用輸入方式建表
//		System.out.println("請輸入科目數量");
//		int testNo = sc.nextInt();
//		System.out.println("請輸入學生人數");
//		int studentNo = sc.nextInt();
//		Hw4db q6 = new Hw4db(testNo, studentNo);

		Hw4db q6 = new Hw4db(6, 8);
		q6.setTestScore(1, 10, 35, 40, 100, 90, 85, 75, 70);
		q6.setTestScore(2, 37, 75, 77, 89, 64, 75, 70, 95);
		q6.setTestScore(3, 100, 70, 79, 90, 75, 70, 79, 90);
		q6.setTestScore(4, 77, 95, 70, 89, 60, 75, 85, 89);
		q6.setTestScore(5, 98, 70, 89, 90, 75, 90, 89, 90);
		q6.setTestScore(6, 90, 80, 100, 75, 50, 20, 99, 75);
//		分數表確認用
//		q6.showScoreTable();
		q6.showTimesTopOne();
		
		sc.close();
	}
}
