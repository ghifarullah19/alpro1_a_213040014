package pertemuan07;

import java.util.Scanner;

public class Soal7 {

		public static void main(String [] args) {
			Scanner sc = new Scanner (System.in);
			
			int golongan, gaji_pokok, bonus;
			double tunjangan, gaji_karyawan;
			 
			System.out.print("Golongan : ");
			golongan = sc.nextInt();
			
			if (golongan == 1) {
				gaji_pokok = 2000000;
				tunjangan = gaji_pokok * 0.2;
				bonus = 0;
				gaji_karyawan = gaji_pokok + tunjangan + bonus;
				System.out.println("Gaji pokok : " + gaji_pokok + "\n" +
									"Tunjangan : " + tunjangan + "\n" +
									"Bonus : " + bonus + "\n" +
									"Gaji Karyawan : " + gaji_karyawan);
			} else if (golongan == 2) {
				gaji_pokok = 2500000;
				tunjangan = gaji_pokok * 0.2;
				bonus = 100000;
				gaji_karyawan = gaji_pokok + tunjangan + bonus;
				System.out.println("Gaji pokok : " + gaji_pokok + "\n" +
									"Tunjangan : " + tunjangan + "\n" +
									"Bonus : " + bonus + "\n" +
									"Gaji Karyawan : " + gaji_karyawan);
			} else if (golongan == 3) {
				gaji_pokok = 3000000;
				tunjangan = gaji_pokok * 0.2;
				bonus = 200000;
				gaji_karyawan = gaji_pokok + tunjangan + bonus;
				System.out.println("Gaji pokok : " + gaji_pokok + "\n" +
									"Tunjangan : " + tunjangan + "\n" +
									"Bonus : " + bonus + "\n" +
									"Gaji Karyawan : " + gaji_karyawan);
			} else if (golongan == 4) {
				gaji_pokok = 4000000;
				tunjangan = gaji_pokok * 0.2;
				bonus = 300000;
				gaji_karyawan = gaji_pokok + tunjangan + bonus;
				System.out.println("Gaji pokok : " + gaji_pokok + "\n" +
									"Tunjangan : " + tunjangan + "\n" +
									"Bonus : " + bonus + "\n" +
									"Gaji Karyawan : " + gaji_karyawan);
			}
		}
}
