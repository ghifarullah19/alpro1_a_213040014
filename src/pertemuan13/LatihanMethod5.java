package pertemuan13;

public class LatihanMethod5 {
	
	/*
	 * parameter
	 * format method
	 * 
	 * public static tipedata namaMethod (Parameter) {
	 * 
	 * 		// isi method 
	 * 		return value; // khusus untuk fungsi
	 * 
	 * }
	 * 
	 * Parameter adalah variable yang digunakan untuk 
	 * mengirimkan nilai dari pemanggil method, ke dalam 
	 * method
	 * 
	 * Parameter terdapat dua macam yaitu
	 * parameter aktual, yaitu nilai yang dituliskan pada saat pemanggilan
	 * parameter faktual, yaitu nilai yang ada saat pendeklarasian methods
	 * 
	 * yang harus kita perhatikan dalam pembuatan parameter adalah urutan
	 * dari parameter faktual
	 * 
	 */
	
	public static void hitungGenap(int x, int y) {
		int sisaBagi = x % y;
		System.out.println(sisaBagi);
	}
	
	public static void penjumlahan(int a, int b) {
		//kit memiliki dua buah parameter yaitu a dan b
		int jumlah = a + b;
		System.out.println(jumlah);
	}
	
	public static void main(String[] args) {
		/*
		 * jika kita menggunakan parameter
		 * saat pemanggilaan kita harus mengirimkan nilai 
		 * melalui parameter tersebut
		 */
		
		penjumlahan(3, 5);
		
		int a = 4;
		int b = 3;
		
		penjumlahan(a, b);
		
		int nilai1 = 10;
		int nilai2 = 5;
		
		penjumlahan(nilai1, nilai2);
		
		hitungGenap(5, 2);
	}

}
