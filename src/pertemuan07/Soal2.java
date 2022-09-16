package pertemuan07;

import java.util.Scanner;

public class Soal2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		double dIPK;
		int iUmur;
		
		System.out.print("Masukkan umur anda : ");
		iUmur = sc.nextInt();
		
		if (iUmur <= 22) {
			
			System.out.print("Masukkan IPK anda : ");
			dIPK = sc.nextDouble();
			
			if (dIPK >= 3.30) {
				System.out.println("Selamat anda dapat mengikuti beasiswa");
			} else {
				System.out.println("Maaf, belum rezeki anda");
			}
		} else {
			System.out.println("Maaf, anda tidak masuk kualifikasi");
		}
	}
	
}
