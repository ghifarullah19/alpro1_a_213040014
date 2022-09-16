package uts;

import java.util.Scanner;

public class Soal2 {

	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int ujian1, ujian2;
		
		System.out.print("Masukkan nilai ujian 1 : ");
		ujian1 = sc.nextInt();
		System.out.print("Masukkan nilai ujian 2 : ");
		ujian2 = sc.nextInt();
		
		if ((ujian1 >= 65) && (ujian2 >= 65)) {
			System.out.println("Selamat anda lulus sertifikasi ini");
		} else {
			System.out.println("Maaf, anda harus mencoba lagi lain waktu");
		}
	}
}
