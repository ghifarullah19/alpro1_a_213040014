package pertemuan09;

import java.util.Scanner;

public class LatihanWhile5 {

	public static void main(String[] args) {
		
		/* Contoh soal: 
		 * Buatlah sebuah program pengulangan di mana akan diminta 
		 * menginputkan bilangan bulat secara berulang selama 
		 * bilangan bulat tersebut himpunan dari 1 - 100
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int angka;
		
		System.out.print("Masukan angka: ");
		angka = sc.nextInt();
		
		while ((angka >= 0) && (angka <= 100)) {
			System.out.print("Masukan angka: ");
			angka = sc.nextInt();
		}
		
		while ((angka >= 0) && !(angka < 0)) {
			System.out.print("Masukan angka: ");
			angka = sc.nextInt();
		}
	}
}
