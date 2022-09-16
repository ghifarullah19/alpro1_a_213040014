package pertemuan09;

import java.util.Scanner;

public class LatihanWhile1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int angkatan;
		
		System.out.print("Masukan angkatan anda: ");
		angkatan = sc.nextInt();
		
		while ((angkatan == 2021) || (angkatan == 2020)) {
			System.out.println("Selamat datang angkatan keren!");
			System.out.print("Masukan angkatan anda: ");
			angkatan = sc.nextInt();
		}
	}
}
