package pertemuan05;

import java.util.Scanner;

public class LatihanELSEIF {

	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int nilai;
		
		System.out.print("Nilai : ");
		nilai = sc.nextInt();
		
		if (nilai >= 85) {
			System.out.println("A");
		} else if (nilai >= 60) {
			System.out.println("B");
		} else if (nilai >= 45) {
			System.out.println("C");
		} else if (nilai >= 30) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}
}
