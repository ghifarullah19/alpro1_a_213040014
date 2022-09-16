package pertemuan03;

import java.util.Scanner;

public class LatihanInputScanner {
	public static void main(String [] args) {
		/*
		 * inputan Scanner 
		 * merupakan inputan keyboard yang lebih modern dari bufferedReader
		 * utility yang lengkap menyesuaikan tipedata yang digunakan
		 * 
		 * kapasitas buffering 1kb
		 * punya permasalahan menerima inputan spasi
		 * keamanan yang kurang aman, tidak diwajibkan menggunakan try catch blok
		 */
		
		Scanner scInput = new Scanner (System.in);
		
		String sNRP, sNama;
		int iNilai;
		double dIPK;
		
		sNRP = scInput.next();
		sNama = scInput.next();
		iNilai = scInput.nextInt();
		dIPK = scInput.nextDouble();
		
		System.out.println("NRP : "+ sNRP + "\nNama : " + sNama
				+ "\nNilai : " + iNilai + "\nIPK : " + dIPK);
		
//		sNRP = scInput.next();
//		sNama = scInput.nextLine();
//		iNilai = scInput.nextInt();
//		dIPK = scInput.nextDouble();
		
//		System.out.println(sNama);
		
		
		
		
		
		
		
	}
}
