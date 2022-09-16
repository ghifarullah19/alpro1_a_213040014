package pertemuan14;

public class MainBuku {

	/*
	 * Saat membuat record, kita harus tetap menyiapkan
	 * main class.
	 * main class berfungsi sebagai class utama yang 
	 * memiliki public static void main, 
	 * dan juga yang akan menggunakan class record
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * cara memanggil reocrd mitip dengan pembuatan variable
		 * formatnya :
		 * 
		 * NamaRecord alias = new NamaRecord();
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * anda saat menggunakan Scanner = menggunakan Record
		 * 
		 * memanggil method dalam record = memanggil .next() dalam scanner
		 * 
		 */
		
		Buku book = new Buku();
		
		book.inputData("Harry Potter", "J.K. Rowling", "Toga Mas", 5000);
		book.tampilData();
	}
}
