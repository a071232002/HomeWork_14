package hw2;

public class TestNineNine {
	public static void main (String[] args) {
		
//		for + while
		int a;
		
		for (a = 1; a <= 9; a++){
			int b = 1;
			while (b <= 9) {
				System.out.print(a + "*" + b + "=" + a*b + "\t");
				b++;
			}
			System.out.println();
		}
		System.out.println("========================================================================");
		
//		for + do....while
		for (a = 1; a <= 9; a++){
			int c = 1;
			do {
				System.out.print(a + "*" + c + "=" + a*c + "\t");
				c++;
			} while (c <= 9);
			System.out.println();
		}
		System.out.println("========================================================================");
		
//		while + do...while
		a = 1;
		while (a <= 9) {
			int d = 1;
			do {
				System.out.print(a + "*" + d + "=" + a*d + "\t");
				d++;
			} while (d <= 9);
			System.out.println();
			a++;
		}
		
	}
}
