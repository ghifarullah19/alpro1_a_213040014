package pertemuan02;

public class LatihanVariable2 {
	public static void main (String [] args) {
		/*
		 * menggunakan operasi matematis
		 * + untuk penjumlahan
		 * - untuk pengurangan 
		 * / untuk pembagian
		 * * untuk perkalian
		 * % untuk modulus (sisa bagi)
		 *  
		 */
		
		int iNilai1 = 10;
		int iNilai2 = 2;
		
		System.out.println(iNilai1 + iNilai2);
		System.out.println(iNilai1 - iNilai2);
		System.out.println(iNilai1 * iNilai2);
		System.out.println(iNilai1 / iNilai2);
		System.out.println(iNilai1 % iNilai2);
		
		/*
		 * untuk String tanda + digunakan untuk menggabungkan (concation)
		 */
		
		//Menghasilkan 102 karena terbaca sebagai concation		
		System.out.println("Hasil penjumlahan " + iNilai1 + iNilai2);
		
		//Tambahkan tanda kurung kepada variable int untuk operasi matematis		
		System.out.println("Hasil penjumlahan " + (iNilai1 + iNilai2));
	}
}
