package hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Hw4db {

	Scanner sc = new Scanner(System.in);

//	Q1
	private int[] array;
	private double numAvg;
//	Q2
	private String word;
//	Q3
	private String[] wordXXX;
//	Q4
	private int moneyYouWant;
	private int[][] moneyInfo;
//	Q5
	private int year;
	private int month;
	private int day;
	private int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//	Q6
	private int[][] scoreTable;
	private int[][] scoreSort = new int[6][8];

//	Q1**************************************************
	public Hw4db(int... c) {
		array = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			array[i] = c[i];
		}
	}

	public double getAvg() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		numAvg = sum / array.length;
		return numAvg;
	}

	public void showOverAvg() {
		System.out.println("大於平均數的元素:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > numAvg) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}

//	Q2***************************************************

	public Hw4db(String s) {
		this.word = s;
	}

	public void showReverse() {
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
	}

//	Q3***************************************************

	public Hw4db(String... s) {
		wordXXX = new String[s.length];
		for (int i = 0; i < s.length; i++) {
			wordXXX[i] = s[i];
		}
	}

	public int getVowelCheck() {

		int count = 0;
		for (int i = 0; i < wordXXX.length; i++) {
			for (int j = 0; j < wordXXX[i].length(); j++) {
				char w = wordXXX[i].charAt(j);
				if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') {
					count++;
				}
			}
		}

		return count;
	}

//	Q4****************************************************************************

	public Hw4db(int money) {
		this.moneyYouWant = money;
	}

	public void setEmpno(int... empNo) {
		moneyInfo = new int[2][empNo.length];
		for (int i = 0; i < empNo.length; i++) {
			moneyInfo[0][i] = empNo[i];
		}
	}

	public void setCash(int... cash) {
		for (int i = 0; i < cash.length; i++) {
			moneyInfo[1][i] = cash[i];
		}
	}
//	現金資訊比對用
	public void showCashTable() {
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(moneyInfo[j][i] + "\t");
			}
			System.out.println();
		}
	}

	public void moneyWhere() {
		int count = 0;
		System.out.print("有錢可借的員工編號: ");
		for (int i = 0; i < 5; i++) {
			if (moneyInfo[1][i] >= moneyYouWant) {
				count++;
				System.out.print(moneyInfo[0][i] + " ");
			}
		}
		System.out.print("共 " + count + " 人!");
		System.out.println();
	}

//	Q5**************************************************************************

	public Hw4db(int year, int month, int day) {
		if (year % 4 == 0) {
			daysInMonth[2] = 29;
		}
		while (true) {
			if (day <= daysInMonth[month]) {
				break;
			}
			System.out.println("Error 日期大於該月份天數, 請重新輸入");
			System.out.println("請輸入西元年");
			year = sc.nextInt();
			System.out.println("請輸入月份");
			month = sc.nextInt();
			System.out.println("請輸入日期");
			day = sc.nextInt();
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void dayOfYear() {
		int sum = 0;
		for (int i = 0; i < month; i++) {
			sum += daysInMonth[i];
		}
		sum += day;
		System.out.println("輸入的日期為該年第" + sum + "天");
	}

//	Q6****************************************************************************

	public Hw4db(int testNo, int studentNo) {
		scoreTable = new int[testNo][studentNo];
	}

	public void setTestScore(int testNo, int... score) {
		for (int i = 0; i < score.length; i++) {
			scoreTable[testNo - 1][i] = score[i];
		}
	}
//		分數表比對確認
	public void showScoreTable() {
//		原始分數表(未排序)
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 8; i++) {
				System.out.print(scoreTable[j][i] + "\t");
			}
			System.out.println();
		}
		System.out.println("==========================================================");
		
//		分數表排序驗證
		for (int i = 0; i < 6; i++) {
			scoreSort[i] = Arrays.copyOf(scoreTable[i], scoreTable[i].length);
		}
		for (int i = 0; i < 6; i++) {
			Arrays.sort(scoreSort[i]);
		}
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 8; i++) {
				System.out.print(scoreSort[j][i] + "\t");
			}
			System.out.println();
		}
		System.out.println("==========================================================");
	}
	

	public void showTimesTopOne() {
//		複製一個新的二維陣列並做排序
		for (int i = 0; i < 6; i++) {
			scoreSort[i] = Arrays.copyOf(scoreTable[i], scoreTable[i].length);
		}
		for (int i = 0; i < 6; i++) {
			Arrays.sort(scoreSort[i]);
		}
//		分數表每Row的值, 若等於最高分(排序後index end的對應值), 則對應號碼同學times+1
		int[] times = new int[8];
		for (int i = 0; i < 6; i++) {
			for (int setNo = 0; setNo < 8; setNo++) {
				if (scoreTable[i][setNo] == scoreSort[i][7]) {
					times[setNo]++;
				}
			}
		}
		for (int i=1;i<=8;i++) {
			System.out.print(i+"號"+"\t");	
		}
		System.out.println();
		for (int i=0;i<8;i++) {
			System.out.print(times[i]+"次"+"\t");
		}
	}

}
