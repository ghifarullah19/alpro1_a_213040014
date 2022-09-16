package pertemuan02;

public class LatihanVariable1 {
	/*
	 * Class ini akan mempelajari cara membuat variable di java
	 * 
	 * variable dibagi menjadi dua kelompok :
	 * 1. matematis : untuk bilbul menggunakan int, untuk desimal menggunakan Double
	 * 2. Teks : menggunakan string
	 * 
	 * format pembuatan variable
	 * [tipedata] [identittasVariable] = [nilai];
	 * 
	 */
		public static void main (String [] args) {
			//s di depan variable diartikan untuk variable bertipe String 		
			String sNama = "Cristiano Ronaldo";
			
			System.out.println("Striker Manchester United adalah " + sNama);
			
			int iNo = 7;
			
			System.out.println("Striker Manchester United adalah " + sNama + " no punggung " + iNo);
			
			double dSuhuTubuh = 36.2;
			
			//ctrl + space untuk shortcut 		
			System.out.println("Striker Manchester United adalah " + sNama + " no punggung " + iNo + " Dengan suhu tubuh " + dSuhuTubuh);
		}
}
