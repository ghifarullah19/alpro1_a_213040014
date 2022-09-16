package pertemuan07;

import java.util.Scanner;

public class Soal5 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int panjang, tinggi, luas;
		
		System.out.print("Panjang: ");
		panjang = sc.nextInt();
		
		System.out.print("Tinggi: ");
		tinggi = sc.nextInt();
		
		luas = panjang * tinggi;
		System.out.println("Luas: " + luas);
	}
}
