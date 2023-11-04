package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hw7DataBase {

//	Q1
	
	public int getCharCount(File dir) throws IOException {
		int charCount = 0;
		String str;
		FileReader fr = new FileReader(dir);
		BufferedReader br = new BufferedReader(fr);
		while ((str = br.readLine()) != null) {
			charCount += str.length();
		}
		br.close();
		fr.close();
		return charCount;
	}

	public int getLineCount(File dir) throws IOException {
		int lineCount = 0;
		FileReader fr = new FileReader(dir);
		BufferedReader br = new BufferedReader(fr);
		while (br.readLine() != null) {
			lineCount++;
		}
		br.close();
		fr.close();
		return lineCount;
	}

//	Q2
	public void writeNumIntoData(File dir) throws IOException {

		FileWriter fw = new FileWriter(dir, true);
		BufferedWriter bw = new BufferedWriter(fw);

		List<Integer> list = new ArrayList<>();
		while (list.size() != 10) {
			list.add((int) (Math.random() * 1000 + 1));
		}
		Collections.sort(list);
		bw.append(list.toString());
		bw.newLine();
		System.out.println("已寫入完成, 請查看" + dir.getPath());
		bw.close();
		fw.close();
	}

//	Q3
	public void copyFile(File inputFile, File outputFile) throws IOException {
		FileInputStream in = new FileInputStream(inputFile);
		FileOutputStream out = new FileOutputStream(outputFile);
		int end;
		byte[] buffer = new byte[(int) inputFile.length()];
		while ((end = in.read(buffer)) != -1) {
			out.write(buffer, 0, end);
		}
		System.out.println(inputFile.getName()+"檔案已複製完成!");
		in.close();
		out.close();
	}
	
//	Q4
	
	public void objectOut(File file, Object[] object) throws IOException {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < object.length; i++) {
			oos.writeObject(object[i]);
		}
		System.out.println(object.getClass()+"物件寫入完成");
		oos.close();
		fos.close();
	}
	
	public void objectRead(File file) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
				System.out.println("----------------");
			}
		} catch (IOException e) {
			System.out.println("資料讀取完畢!");
		}
		ois.close();
		fis.close();
	}
	
}
