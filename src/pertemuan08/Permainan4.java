package pertemuan08;

import java.util.Scanner;

public class Permainan4 {

	public static void main(String[] args) {
		
		System.out.println("Awal Program\n");
		
		System.out.println("Nilai Faktorial");
		
	    Scanner sc = new Scanner(System.in);
	    int i, n, faktorial;

	    System.out.print("Masukan angka: ");
	    n = sc.nextInt();
	    faktorial = 1;
	    System.out.print("\n");

	    for (i = 1; i <= n; i++) {
	    	System.out.println("Nilai i adalah " + i);
	        faktorial *= i;
	        System.out.println("Nilai faktorial adalah " + faktorial + "\n");
	    }
	    System.out.println("Hasil akhir faktorial = " + faktorial);

	    System.out.println("\nAkhir Program");
	}
}
