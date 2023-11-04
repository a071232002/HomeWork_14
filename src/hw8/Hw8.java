package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hw8 {

	public static void main(String[] args) {

//		•請建立一個Collection物件並將以下資料加入：
//	 	Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//	 	Object物件、“Snoopy”、BigInteger(“1000”)

		List<Object> list = new ArrayList<>();
		list.addAll(Arrays.asList(100, 3.14d, 21L, Short.parseShort("100"), 5.1, "Kitty", 100, new Object(), "Snoopy",
				new BigInteger("1000")));

//		• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)

//		Iterator
		Iterator objs = list.iterator();
		while (objs.hasNext()) {
			System.out.print(objs.next() + ", ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");

//		for迴圈
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");

//		foreach
		for (Object xxx : list) {
			System.out.print(xxx + ", ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");

//		• 移除不是java.lang.Number相關的物件

//		再次宣告Iterator(迭代器執行一次後, 即dead) 判斷每個是否可轉型成Number, true則刪除當前元素

		Iterator objsII = list.iterator();
		while (objsII.hasNext()) {
			if (objsII.next() instanceof Number) {
				objsII.remove();
			}
		}

//		• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功

		for (Object xxx : list) {
			System.out.print(xxx + ", ");
		}
		System.out.println();
		System.out.println("============================================================================");

//		• 請設計一個Train類別，並包含以下屬性：
//		- 班次 number，型別為int 
//		- 車種 type，型別為String 
//		- 出發地 start，型別為String
//		- 目的地 dest，型別為String 
//		- 票價 price，型別為double
//		• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
//		- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
//		- (118, “自強”, “高雄”, “台北”, 500)
//		- (1288, “區間”, “新竹”, “基隆”, 400)
//		- (122, “自強”, “台中”, “花蓮”, 600)
//		- (1222, “區間”, “樹林”, 七堵, 300)
//		- (1254, “區間”, “屏東”, “基隆”, 700)

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
	
		List<Train> tlist = new ArrayList<>();
		tlist.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6, t7));
		
		Set<Train> set = new HashSet<>();
		set.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6, t7));
		
		Set<Train> ts = new TreeSet<>();
		ts.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6, t7));

//		• 請寫一隻程式，能印出不重複的Train物件
		
//		Set排除重複未排序, 透過foreach取值
		System.out.println("• 請寫一隻程式，能印出不重複的Train物件");

		for (Train xxx : set) {
			xxx.showInfo();
		}
		System.out.println("----------------------------------------------------------------------------");
		
		
//		• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		
//		List集合只做sort排序, 不排除重複, 並使用for迴圈取值
		System.out.println("• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出");
		
		Collections.sort(tlist);
		for (int i = 0; i<tlist.size();i++) {
			tlist.get(i).showInfo();
		}
		System.out.println("----------------------------------------------------------------------------");
		
//		• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		
//		TreeSet透過compareTo排除重複並排序，並使用迭代器取值
		System.out.println("• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出");
		Iterator objsIII = ts.iterator();
		while (objsIII.hasNext()) {
			((Train) objsIII.next()).showInfo();
		}
		
//		• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

	}
}
