package pertemuan12;
import java.util.Scanner;

public class LatihanArray2 {
	
	/*
	 * Array [er-rey]
	 * array adalah struktur data limiter, yang berarti berurutan
	 * data -> banyak nilai
	 * 
	 * format penulisan akan mirip dengan pembuatan variable
	 * variable : 
	 * <tipedata> <nama> = <nilai>;
	 * 
	 * array :
	 * <tipedata>[] <nama> = new <tipedata> [index]
	 * 
	 * tipedata : String, int, float, double, dkk
	 * 
	 * sekarang kita buat contoh untuk membuat array yang mengelola nilai nama mahasiswa
	 */

	public static String[] arrNama;
	// kita menyediakan sebuah array dengan alias arrNama, elemennya dari 0-4
	public static Scanner sc = new Scanner(System.in);
	
	public static void initArray() {
		System.out.println("Masukan jumlah index yang anda inginkan");
		int index = sc.nextInt();
		arrNama = new String[index];
	}
	
	public static void inputNama() {
		for (int elem = 0; elem < arrNama.length; elem++) {
			System.out.println("Masukan nama mahasiswa ke - " + (elem + 1));
			arrNama[elem] = sc.next();
		}
	}
	
	public static void outputNama() {
		for (int elem = 0; elem < arrNama.length; elem++) {
			System.out.println("Nama mahasiswa ke " + (elem + 1) + " adalah " + arrNama[elem]);
		}
	}
	
	public static void main(String[] args) {
		initArray();
		inputNama();
		outputNama();
	}
}