package pertemuan03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LatihanInputBufferedReader {
	
	public static void main(String [] args) {
		/*
		 * menggunakan bufferedReader
		 * lebih kuno dari Scanner
		 * lebih sulit diingat, utility terkesan terbatas
		 * kapasitas buffering 8kb
		 * lebihaman, karena wajib menggunakan try catch blok
		 */
		
		BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
		
		String sNRP, sNama;
		int iNilai;
		double dIPK;
		
		try {
			//blok try catch untuk menangani error non lojik
			sNRP = brInput.readLine();
			sNama = brInput.readLine();
			//keterbatasan utility mengharuskan konversi tipedata non string
			iNilai = Integer.parseInt(brInput.readLine());
			dIPK = Double.parseDouble(brInput.readLine());
			System.out.println("NRP : "+ sNRP + "\nNama : " + sNama
					+ "\nNilai : " + iNilai + "\nIPK : " + dIPK);
		}catch(Exception e) {
			System.err.print("Nilai atau ipk harus numerik");
		}
		
		
		
		
		
		
		
		
	}
}
