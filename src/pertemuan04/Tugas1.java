package pertemuan04;

import java.util.Scanner;

public class Tugas1 {
	public static void main(String [] args) {
		
		//Inisialisasi scanner
		Scanner scInput = new Scanner (System.in);
		
		//Inisialisasi variable
		String sNRP, sNama;
		
		//Menmabahkan inputan ke variable
		sNRP = scInput.next();
		sNama = scInput.next();
		
		//Output
		System.out.println("Nama	: " + sNama + "\nNRP	: " + sNRP);
		
//		BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
//		
//		String sNRP, sNama;
//		
//		try {
//			//blok try catch untuk menangani error non lojik
//			sNama = brInput.readLine();
//			sNRP = brInput.readLine();
//			System.out.println("Nama	: " + sNama + "\nNRP	: " + sNRP);
//		}catch(Exception e) {
//			System.err.print("Nama harus dan/atau NRP harus dimasukkan");
//		}
		
	}
}
