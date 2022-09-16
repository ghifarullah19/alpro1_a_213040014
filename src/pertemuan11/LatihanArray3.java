package pertemuan11;

import java.util.Scanner;

public class LatihanArray3 {

	public static void main(String[] args) {
		/*
		 * Salah satu yang dimudahkan oleh array adalah
		 * kemudahan, salah satunya kemudahan dalam input
		 * dan menampilkan nilai 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int [] arrNilai = new int [10];
		
		arrNilai [0] = 80;
		arrNilai [1] = 70;
		arrNilai [2] = 90;
		arrNilai [3] = 70;
		arrNilai [4] = 90;
		
		// Bisa kita lihat bahwa saat menginputkan nilai terdapat pola
		for (int index = 0; index < arrNilai.length; index++) {
			arrNilai [index] = sc.nextInt();
		}
		
		for (int index = 0; index < arrNilai.length; index++) {
			System.out.println(arrNilai[index]);
		}
	}
}
