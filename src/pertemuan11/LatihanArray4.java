package pertemuan11;

import java.util.Scanner;

public class LatihanArray4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] intNilai = {60, 75, 50, 80, 90};
		
		/*
		 * Mencari nilai dari array, 
		 * 
		 * jika ditemukan, maka pengulangan berhenti dan output "Ketemu"
		 * jika tidak maka "tidak muncul apapun"
		 * 
		 */
		
		System.out.print("Nilai yang anda cari: ");
		int cari = sc.nextInt();
		String status = "Tidak ditemukan";
		
		for (int index = 0; index < intNilai.length; index++) {
			if (intNilai[index] == cari) {
				status = "Ditemukan pada indeks ke - " + index;
				break;
			}
		}
		
		System.out.println(status);
		
		/* Mencari dua nilai
		System.out.print("Nilai pertama yang anda cari: ");
		int cari_pertama = sc.nextInt();
		System.out.print("Nilai kedua yang anda cari: ");
		int cari_kedua = sc.nextInt();
		
		for (int index = 0; index < intNilai.length; index++) {
			if ((intNilai[index] == cari_pertama) || (intNilai[index] == cari_kedua)) {
				System.out.println("Ketemu nilai pertama");
				break;
			} else if ((intNilai[index] == cari_kedua)) {
				System.out.println("Ketemu nilai kedua");
				//break;
			}
		}
		*/
		
		/*
		System.out.print("Nilai pertama yang anda cari: ");
		int cari_pertama = sc.nextInt();
		System.out.print("Nilai kedua yang anda cari: ");
		int cari_kedua = sc.nextInt();
		
		for (int index = 0; index < intNilai.length; index++) {
			if ((intNilai[index] == cari_pertama) || (intNilai[index] == cari_kedua)) {
				System.out.println("Ketemu nilai pertama " + index + " dan kedua " + index);
				break;
			}
		}
		*/
	}
}
