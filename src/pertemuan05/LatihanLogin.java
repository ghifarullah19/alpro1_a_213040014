package pertemuan05;

import java.util.Scanner;

public class LatihanLogin {

	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		String sUser, sPass;
		
		System.out.print("Username : ");
		sUser = sc.next();
		
		System.out.print("Password : ");
		sPass = sc.next();
		
		if ((sUser.equalsIgnoreCase("admin")) && (sPass.equalsIgnoreCase("abcd1234"))) {
			System.out.println("Selamat datang, admin");
		} else {
			System.out.println("Maaf anda tidak dikenali !!!");
		}
		
		String sJenisKelamin;
		
		System.out.print("Jenis Kelamin : ");
		sJenisKelamin = sc.next();
		
		if ((sJenisKelamin.equalsIgnoreCase("L")) || (sJenisKelamin.equalsIgnoreCase("P"))) {
			System.out.println("Jenis kelamin anda " + sJenisKelamin);
		} else {
			System.out.println("Orang Thailand ya???");
		}
	}
}
