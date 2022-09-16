package pertemuan07;

import java.util.Scanner;

public class Soal1 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		double na;
		int uts, uas, tugas;
		double L , a , t;
		
		System.out.print("Alas : ");
		uts = sc.nextInt();
		System.out.print("Alas : ");
		uas = sc.nextInt();
		System.out.print("Alas : ");
		tugas = sc.nextInt();
		
		na = uts * 0.35 + 0.4 * uas + 0.25 * tugas;
		
		System.out.println(na);
		
//		System.out.print("Alas : ");
//		a = sc.nextDouble();
//		
//		System.out.print("Tinggi : ");
//		t = sc.nextDouble();
//		
//		L = 0.5 * a * t;
//		
//		System.out.println("Luas : " + (a * t));
		
		
	}
}
