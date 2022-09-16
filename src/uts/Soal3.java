package uts;

import java.util.Scanner;

public class Soal3 {

	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		double na;
		int uts, uas, tugas, hdr;
		char idx;
		
		System.out.print("Nilai UTS : ");
		uts = sc.nextInt();
		System.out.print("Nilai UAS : ");
		uas = sc.nextInt();
		System.out.print("Nilai Tugas : ");
		tugas = sc.nextInt();
		System.out.print("Persentasi kehadiran : ");
		hdr = sc.nextInt();
		
		na = 0.35 * uts + 0.4 * uas + 0.25 * tugas;
		System.out.println("Nilai akhir : " + na);
		
		if (hdr < 60) {
			idx = 'E';
			System.out.println("index nilai : " + idx);
		} else {
			
			if (na >= 85) {
				idx = 'A';
				System.out.println("index nilai : " + idx);
			} else if ((na < 85) && (na >= 70)) {
				idx = 'B';
				System.out.println("index nilai : " + idx);
			} else if ((na < 70) && (na >= 50)) {
				idx = 'C';
				System.out.println("index nilai : " + idx);
			} else if ((na < 50) && (na >= 30)) {
				idx = 'D';
				System.out.println("index nilai : " + idx);
			} else {
				idx = 'E';
				System.out.println("index nilai : " + idx);
			}
		}
	}
}
