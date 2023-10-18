package hw1;

public class Hw1 {
	public static void main(String[] args) {
		
//      1 請設計一隻Java程式，計算12，6這兩個數值的和與積
		System.out.println(12+6);
		System.out.println(12*6);
		System.out.println("==========");
		
//		2 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int eggnum = 200;
		System.out.println(eggnum/12+"打"+eggnum%12+"顆");
		System.out.println("==========");
		
//		3 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalsec = 256559;
		int sec = totalsec % 60;
		int min = (totalsec / 60) % 60;
		int hr = (totalsec / 60 / 60) % 24;
		int day = totalsec / 60 / 60 /24;
		System.out.println(day + "天" + hr + "小時" + min + "分" + sec + "秒");
		System.out.println("==========");
		
//		4 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double r = 3.1415;
		double S = 5 * 5 * r;
		double C = 5 * 2 * r;
		System.out.println("圓面積:" + S);
		System.out.println("圓周長:" + C);
		System.out.printf("圓面積:%.2f%n", S);
		System.out.printf("圓周長:%.2f%n", C);
		System.out.println("==========");
		
//		5 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		double $ = 1_500_000;
		System.out.printf("%.2f%n", $ * 1.02 * 1.02 * 1.02 * 1.02 * 1.02 * 1.02 * 1.02 * 1.02 * 1.02 * 1.02);
		System.out.println($* Math.pow(1.02, 10));
		System.out.println("==========");
		
//		6 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		
		System.out.println(5 + 5);     //兩筆數值資料相加, 單純計算5+5=10
		System.out.println(5 + '5');   //'5'單引號內值表示為 Unicode 0035(16進位)轉換為53(10進位)後, 做兩筆值相加 5+53=58
		System.out.println(5 + "5");   //"5"雙引號內值為字串, + 遇字串時為串接功能 => 55 
		
	}

}
