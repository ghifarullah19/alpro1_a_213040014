package pertemuan07;

import java.util.Scanner;

public class Soal4 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int iNilai;
		
		System.out.print("N : ");
		iNilai = sc.nextInt();
		
		if ((iNilai >= 0) && (iNilai <= 100)) {
			System.out.println("Ya");
		} else {
			System.out.println("Tidak");
		}
	}
}
