package pertemuan07;

import java.util.Scanner;

public class Soal6 {

		public static void main(String [] args) {
			Scanner sc = new Scanner (System.in);
			
			double bmi, tinggi, tinggiDalamMeter;
			int berat;
			
			System.out.print("Berat (kg) : ");
			berat = sc.nextInt();
			
			System.out.print("Tinggi (cm) : ");
			tinggi = sc.nextDouble();
			
			tinggiDalamMeter = tinggi / 100;
			
			bmi = berat / (tinggiDalamMeter * tinggiDalamMeter);
			System.out.println("BMI : " + bmi);
			
			if (bmi < 18.5) {
				System.out.println("Berat Badan Kurang");
			} else if (bmi >= 18.5 && bmi <= 24.9) {
				System.out.println("Berat Badan Normal");
			} else if (bmi >= 25 && bmi <= 29.9) {
				System.out.println("Berat Badan Berlebih");
			} else {
				System.out.println("Obesitas");
			}
		}
}
