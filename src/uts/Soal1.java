package uts;

import java.util.Scanner;

public class Soal1 {

	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int x, y;
		
		System.out.print("Nilai x : ");
		x = sc.nextInt();
		System.out.print("Nilai y : ");
		y = sc.nextInt();
		
		System.out.println("Hasil penjumlahan (x + y) = " + (x + y));
		System.out.println("Hasil pengurangan (x - y) = " + (x - y));
		System.out.println("Hasil perkalian (x * y) = " + (x * y));
		System.out.println("Hasil pepembagian (x / y) = " + (x / y));
		System.out.println("Sisa bagi (x mod y) = " + (x % y));
	}
}
