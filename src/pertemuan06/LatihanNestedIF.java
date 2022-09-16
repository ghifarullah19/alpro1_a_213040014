package pertemuan06;

import java.util.Scanner;

public class LatihanNestedIF {
	
	public static void main(String [] args) {
		/*
		 * Nested IF adalah percabangan berlapis di mana memungkinkan adanya pengkondisian di dalam suatu pengkondisian
		 */
		Scanner sc = new Scanner (System.in);
		
		int iUmur;
		// Mandatory
		System.out.print("Masukan umur siswa :");
		iUmur = sc.nextInt();
		
		if ((iUmur >= 5) && (iUmur <= 7)) {
			// range umur >= 5 dan < 7 = 5, 6, 7
			if (iUmur < 7) {
				// umur 5-6
				System.out.println("Kelas A");
			} else {
				// umur 7 tahun
				System.out.println("Kelas B");
			}
		} else {
			System.out.println("Maaf anda belum beruntung");
		}
		
		
	}
}
