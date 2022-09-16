package pertemuan12;

import java.util.Scanner;

public class LatihanArray6 {

	public static void main(String[] args) {
		int[] arrNilai = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for (int indeks = 0; indeks < arrNilai.length; indeks++) {
			System.out.println("Masukan Nilai : ");
			arrNilai[indeks] = sc.nextInt();
		}
		
		for (int indeks = 0; indeks < arrNilai.length; indeks++) {
			System.out.println(arrNilai[indeks]);
		}
	}
}
