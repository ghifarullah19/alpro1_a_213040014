package pertemuan06;

import java.util.Scanner;

public class LatihanNestedIF2 {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		
		String sAngkatan, sKelas;
		// Mandatory / input angkatan
		System.out.print("Masukkan angkatan anda :");
		sAngkatan = scan.next();
		
		// pembagian angkatan
		if (sAngkatan.equalsIgnoreCase("2021")) {
			
			// input kelas
			System.out.print("Masukkan kelas anda :");
			sKelas = scan.next();
			
			// pembagian kelas
			if (sKelas.equalsIgnoreCase("A")) {
				System.out.println("Asik anaknya");
			} else if (sKelas.equalsIgnoreCase("B")) {
				System.out.println("Boljug anaknya");
			} else if (sKelas.equalsIgnoreCase("C")) {
				System.out.println("Cuco anaknya");
			} else if (sKelas.equalsIgnoreCase("D")) {
				System.out.println("Rame anaknya");
			}
		} else {
			System.out.println("Tua dong");
		}
	}
}
