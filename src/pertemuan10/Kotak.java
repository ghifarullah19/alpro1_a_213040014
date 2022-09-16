package pertemuan10;

import java.util.Scanner;

public class Kotak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Pembuatan kotak");
		System.out.println("---------------");
		
		System.out.print("n (lebih besar daripada 2) = ");
		n = sc.nextInt();
		
		//Tampilkan 2 n simbol *
		for (int kolom = 1; kolom <= 2 * n; kolom++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		//Tampilkan 1 simbol *
		//  diikuti dengan sejumlah spasi
		//  dan satu simbol *
		for (int indeks = 1; indeks <= n - 2; indeks++) {
			// Dari sini (kolom2 - kolom4) 
				//Tampilkan 1 simbol *
				System.out.print("*");
				for (int kolom2 = 1; kolom2 <= 2 * n - 2; kolom2++) {
					//  diikuti dengan sejumlah spasi
					System.out.print(" ");
				}
					//  dan satu simbol *
				System.out.println("*");
			// Sampai sini adalah 1 baris
		}
		
		//Tampilkan 2 n simbol *
		for (int kolom5 = 1; kolom5 <= 2 * n; kolom5++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
}
