package hw7;

import java.io.File;

public class Hw7 {

	public static void main(String[] args) throws Exception {

//		請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//		Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

		Hw7DataBase q1 = new Hw7DataBase();
		
		File myTxt = new File("C:/CHA104_Workspace/HomeWork_14/test/Sample.txt");
		int numChar = q1.getCharCount(myTxt);
		int numLine = q1.getLineCount(myTxt);
		System.out.println(myTxt.length() + "位元組, " + numChar + "個字元, " + numLine + "列資料");
		System.out.println("===========================================");

//		請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 
//		(請使用append功能讓每次執行結果都能被保存起來)

		Hw7DataBase q2 = new Hw7DataBase();

		File myData = new File("C:/CHA104_Workspace/HomeWork_14/test/Data.txt");
		q2.writeNumIntoData(myData);
		System.out.println("===========================================");

//		請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//		代表的檔案會複製到第二個參數代表的檔案

		Hw7DataBase q3 = new Hw7DataBase();
		File intputFile = new File("C:/CHA104_Workspace/HomeWork_14/test/Sample.txt");
		File outputFile = new File("C:/CHA104_Workspace/HomeWork_14/test/DataCopy.txt");
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}

		q3.copyFile(intputFile, outputFile);
		System.out.println("===========================================");

//		請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//		意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

		Hw7DataBase q4 = new Hw7DataBase();
//		建立存放位置
		File file = new File("C:/data/Object.ser");
		File dir = new File(file.getParent());
		if (!dir.exists()) {
			dir.mkdir();
		}

//		建立父類別 Animal 實作 Serializable 介面
		Animal[] animal = new Animal[4];
		animal[0] = new Dog("狗1");
		animal[1] = new Dog("狗2");
		animal[2] = new Cat("貓1");
		animal[3] = new Cat("貓2");

		q4.objectOut(file, animal);
		System.out.println("===========================================");

//		承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 
//		(請利用多型簡化本題的程式設計)

		q4.objectRead(file);

	}
}
