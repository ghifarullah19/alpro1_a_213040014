package pertemuan09;

import java.util.Scanner;

public class LatihanWhile4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String angkatan;
		
		System.out.print("Masukan angkatan anda: ");
		angkatan = sc.next();
		
		while (angkatan.equals("2021")) {
			System.out.println("Infinity 21 paling oke!");
			System.out.print("Masukan angkatan anda: ");
			angkatan = sc.next();
		}
	}
}
