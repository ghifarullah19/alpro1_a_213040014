package pertemuan10;

import java.util.Scanner;

public class Piramida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Pembuatan piramida terbalik");
		System.out.println("===========================");
		
		System.out.print("n = ");
		n = sc.nextInt();
		
		for (int baris = 1; baris <= n; baris++) {
			//Tampilkan karakter spasi
			for (int kolom = 1; kolom <= baris - 1; kolom++) {
				System.out.print(" ");
			}
			
			//Tampilkan *
			for (int indeks = 1; indeks <= 2 * (n - baris) + 1; indeks++) {
				System.out.print("*"); //Simbol *
			}
			
			System.out.print("\n");
		}
	}
}
 