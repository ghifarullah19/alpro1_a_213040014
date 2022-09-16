package Latihan_UAS;

import java.util.Scanner;

public class PerhitunganGajiPegawai {
	
	Scanner sc = new Scanner(System.in);

	String nama, nip, golongan;
	int bonus, gajiPokok, tunjangan;
	
	void inputData() {
		System.out.println("Masukan NIP: ");
		nip = sc.next();
		System.out.println("Masukan Nama: ");
		nama = sc.nextLine();
		System.out.println("Masukan Golongan: ");
		golongan = sc.next();
	}
	
	void gajiPokok() {
		switch (golongan) {
		case "A":
			gajiPokok = 2000000;
			tunjangan = gajiPokok * 2/100;
			break;
		case "B":
			gajiPokok = 2500000;
			bonus = 100000;
			tunjangan = gajiPokok * 55/1000;
			break;
		case "C":
			gajiPokok = 3000000;
			bonus = 200000;
			tunjangan = gajiPokok * 7/100;
			break;
		case "D":
			gajiPokok = 4000000;
			tunjangan = gajiPokok * 105/1000;
			bonus = 300000;
			break;
		case "E":
			gajiPokok = 5000000;
			tunjangan = gajiPokok * 5/100;
			bonus = 500000;
			break;
		}
	}
	
	void tampildata() {
		System.out.println("NIP: " + nip);
		System.out.println("Golongan: " + golongan);
		System.out.println("Gaji Pokok: " + gajiPokok);
		System.out.println("Tunjangan: " + tunjangan);
		System.out.println("Bonus: " + bonus);
	}
	
	void gajiTotal() {
		int gajiTotal = gajiPokok + tunjangan + bonus;
		System.out.println(gajiTotal); 
	}
}
