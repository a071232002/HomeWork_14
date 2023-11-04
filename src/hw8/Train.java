package hw8;

import java.util.Objects;

public class Train implements Comparable<Train>{

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	
	
	public Train() {
		
	}
	
	public Train(int number, String type, String start, String dest, double price ) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void showNumber() {
		System.out.println("班次:"+number);
	}
	
	public void showInfo() {
		System.out.println("班次:"+number+", 車種:"+type+", 出發地:"+start+", 目的地:"+dest+", 票價:" +price);
	}
	
//	實作 Comparable<Train>介面, 告訴Java比較規則 => 將班次當作PK排序並判斷有無重複 (ArrayList, TreeSet適用)
	public int compareTo(Train t) {
		if(this.number < t.number) { 					// "<" DESC  , ">" ASC
			return 1;
		} else if (this.number == t.number) {   		// 比對班次相等 return 0 判斷為相同物件排除 (for TreeSet)
			return 0;
		} else  {
			return -1;	
		}
	}
//	覆寫 hashCode 及 equals for HashSet 判斷有無重複
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number;
	}
//	----------------------------------------------------------------
}
