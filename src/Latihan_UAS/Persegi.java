package Latihan_UAS;

import java.util.Scanner;

public class Persegi {

	Scanner sc = new Scanner(System.in);

	double alas, tinggi;
	
	void BacaPersegi() {
		System.out.println("Masukan Alas: ");
		alas = sc.nextDouble();
		System.out.println("Masukan Tinggi: ");
		tinggi = sc.nextDouble();
	}
	
	void TulisPersegi() {
		System.out.println("Alas: " + alas + ", Tinggi: " + tinggi);
	}
	
	double LuasPersegi() {
		return alas * tinggi;
	}
}
