package pertemuan10;

import java.util.Scanner;

public class LatihanSwitchDalamLoop1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int input;
		
		System.out.println("Selamat Datang. \n" 
		+ "Silahkan pilih menu berikut :\n"
		+ "1. OK \n"
		+ "2. Freedom Combo \n"
		+ "3. Youtuber \n"
		+ "99. Exit \n"
		+ "Menu yang anda pilih :");
		// \n adalah karakter khusus untuk enter
		
		input = sc.nextInt();
		
		while (input != 99) {			
			switch (input) {
			case 1: // sama dengan jika input == 1 
				System.out.println("Paket OK");
				break;
			case 2: // sama dengan jika input == 2
				System.out.println("Paket " + "Freedom Combo");
				break;
			case 3: // sama dengan jika input == 3
				System.out.println("Paket Youtuber");
				break;
			default: // sama dengan else dalam if
				System.out.println("Menu tidak dikenali");
				break;
			}
			
			System.out.println("Selamat Datang. \n" 
					+ "Silahkan pilih menu berikut :\n"
					+ "1. OK \n"
					+ "2. Freedom Combo \n"
					+ "3. Youtuber \n"
					+ "99. Exit \n"
					+ "Menu yang anda pilih :");
					// \n adalah karakter khusus untuk enter
					
					input = sc.nextInt();
			
		}
		System.out.println("Terima kasih");
	}
}
