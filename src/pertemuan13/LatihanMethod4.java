package pertemuan13;
import java.util.Scanner;

public class LatihanMethod4 {

	static Scanner sc = new Scanner(System.in);
	// variable global yang dapat diakses oleh method ataupun main program
	
	public static void sapaDunia() {
		System.out.println("Hallo Dunia");
	}
	
	public static void tulisNama() {
		System.out.println("Masukan Nama ");
		String nama = sc.next();
		//variable local method, hanya dapat dikenali didalam method
		System.out.println("Nama saya adalah " + nama);
	}
	
	public static void main(String[] args) {
		//ini main program
		sapaDunia();
		tulisNama();
	}
}
