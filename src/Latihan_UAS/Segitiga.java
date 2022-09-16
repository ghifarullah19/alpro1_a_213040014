package Latihan_UAS;

import java.util.Scanner;

public class Segitiga {
	Scanner sc = new Scanner(System.in);

	double alas, tinggi;
	
	void BacaSegitiga() {
		System.out.println("Masukan Alas: ");
		alas = sc.nextDouble();
		System.out.println("Masukan Tinggi: ");
		tinggi = sc.nextDouble();
	}
	void TulisSegitiga() {
		System.out.println("Alas: " + alas + " , Tinggi: " + tinggi);
	}
	double Luas() {
		return 0.5 * alas * tinggi;
	}
}
