package pertemuan05;

import java.util.Scanner;

public class LatihanStatementIFELSE {

		public static void main(String [] args) {
			Scanner sc = new Scanner (System.in);
			
			int nilai;
			
			System.out.print("Nilai : ");
			nilai = sc.nextInt();
			
			if (nilai >= 60) { //akan dianggap true jika nilai >= 60
				System.out.println("Lulus"); //dieksekusi jika true
			} else { //blok kode untuk yang false (<60)
				System.out.print("Tidak Lulus");
			}
			
			System.out.println("selesai");
		}
}
