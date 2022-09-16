package Latihan_UAS;

import java.util.Scanner;

public class MencariIndexNilai {
	
	Scanner sc = new Scanner(System.in);

	String NRP;
	char idx;
	double UTS, UAS, Praktikum, Tugas, NilaiAkhir, hdr;
	
	void InputData() {
		System.out.println("Masukan NRP: ");
		NRP = sc.next();
		System.out.println("Masukan UTS: ");
		UTS = sc.nextDouble();
		System.out.println("Masukan UAS: ");
		UAS = sc.nextDouble();
		System.out.println("Masukan Praktikum: ");
		Praktikum = sc.nextDouble();
		System.out.println("Masukan Tugas: ");
		Tugas = sc.nextDouble();
		System.out.println("Masukan Presentase Kehadiran: ");
		hdr = sc.nextDouble();
	}
	
	void TampilData() {
		System.out.println("NRP: " + NRP);
		System.out.println("UTS: " + UTS);
		System.out.println("UAS: " + UAS);
		System.out.println("Praktikum: " + Praktikum);
		System.out.println("Tugas: " + Tugas);
		System.out.println("Kehadiran: " + hdr);
	}
	
	double NilaiAkhir() {
		NilaiAkhir =  0.3 * UTS + 0.3 * UAS + 0.25 * Praktikum + 0.15 * Tugas;
		return NilaiAkhir;
	}
	
	void IndeksNilai() {
		if (hdr < 60) {
			idx = 'E';
			System.out.println("Indeks Nilai: " + idx);
		} else {			
			if (NilaiAkhir() >= 85) {
				System.out.println("Nilai Akhir: " + NilaiAkhir);
				System.out.println("Indeks Nilai A");
			} else if (NilaiAkhir() >= 70) {
				System.out.println("Nilai Akhir: " + NilaiAkhir);
				System.out.println("Indeks Nilai B");
			} else if (NilaiAkhir() >= 55) {
				System.out.println("Nilai Akhir: " + NilaiAkhir);
				System.out.println("Indeks Nilai C");
			} else if (NilaiAkhir() >= 30) {
				System.out.println("Nilai Akhir: " + NilaiAkhir);
				System.out.println("Indeks Nilai D");
			} else {
				System.out.println("Nilai Akhir: " + NilaiAkhir);
				System.out.println("Indeks Nilai E");
			}
		}
	}
}
