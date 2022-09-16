package pertemuan07;

import java.util.Scanner;

public class Soal3 {

		public static void main(String [] args) {
			Scanner sc = new Scanner (System.in);
			
			int x, y;
			
			System.out.print("X : ");
			x = sc.nextInt();
			
			System.out.print("Y : ");
			y = sc.nextInt();
			
			if (x > y) {
				System.out.println("X lebih besar");
			} else if (x < y) {
				System.out.println("Y lebih besar");
			} else {
				System.out.println("X sama dengan Y");
			}
		}
}
