package pertemuan08;

import java.util.Scanner;

public class LatihanFor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nama;
		
		System.out.print("Masukan nama: ");
		nama = sc.nextLine();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(nama);
		}
	}
}
