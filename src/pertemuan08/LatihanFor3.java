package pertemuan08;

import java.util.Scanner;

public class LatihanFor3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nama;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Masukan nama: ");
			nama = sc.nextLine();
			System.out.println(nama);
		}
	}
}
