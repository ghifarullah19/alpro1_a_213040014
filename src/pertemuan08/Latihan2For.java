package pertemuan08;

import java.util.Scanner;

public class Latihan2For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		System.out.print("Masukan angka: ");
		int n = sc.nextInt();
		
		// Baris 
		for (; i <= n; i++) {
			// Kolom 
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int k = n; k >= i; k--) {
				System.out.print("@ ");
			}
			for (int l = n; l >= i; l--) {
				System.out.print("^ ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
		// Baris 
		for (int o = 1; o <= n; o++) {
			// Kolom
			for (int p = n; p >= o; p--) {
				System.out.print("# ");
			}
			for (int q = 1; q <= o; q++) {
				System.out.print("^ ");
			}
			for (int r = 1; r <= o; r++) {
				System.out.print("@ ");
			}
			for (int s = n; s >= o; s--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
