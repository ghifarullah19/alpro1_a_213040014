package pertemuan10;

import java.util.Scanner;

public class LatihanNestedLoop {

	public static void main(String[] args) {
		/*
		 * nested loop adalah bagaiman kita membuat program dengan loop yang berlapis
		 * berlapis adalah adanya loop di dalam loop
		 * format :
		 * for (inisialisasi; syarat; inc/dec) {
		 * 		for (inisialisasi2; syarat2; inc/dec) {
		 * 	}
		 * }
		 * 
		 * +++++
		 * +++++
		 * +++++
		 * +++++
		 * +++++
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukan nilai n: ");
		int n = sc.nextInt();
		
		System.out.println("+++++");
		System.out.println("+++++");
		System.out.println("+++++");
		System.out.println("+++++");
		System.out.println("+++++");
		
		System.out.println("===============");
		
		for (int a = 0; a < 5; a++) {
			System.out.println("+++++");
		}
		
		System.out.println("===============");
		
		for (int i = 10; i > n; i--) {
			//looping untuk baris
			for (int j = 0; j < i; j++) {
				//looping untuk kolom (kepinggir)
				System.out.print("+");				
			}
			System.out.println();
		}
	}
}
