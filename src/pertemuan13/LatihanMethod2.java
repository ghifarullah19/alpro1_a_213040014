package pertemuan13;
import java.util.Scanner;

public class LatihanMethod2 {
	
	/*
	 * Variable global
	 * variable yang terdapat di dalam kelas tetapi
	 * di luar method atau main method 
	 */
	// variable global
	public static Scanner sc = new Scanner(System.in);
	
	public static void tulisNama() {
		System.out.print("Tuliskan nama anda: ");
		// variable lokal
		String nama = sc.next();
		System.out.println(nama);
	}
	
	public static void main(String[] args) {
		
		System.out.print("Masukan menu: ");
		int menu = sc.nextInt();
		if (menu == 1) {
			tulisNama();
		} else {
			System.out.println("Menu tidak ada");
		}
	}
}
