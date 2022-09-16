package pertemuan14;

public class Buku {

	/*
	 *  Class record adalah class yang class lain di luar main,
	 *  sehingga tidak memiliki public static void main
	 *  
	 *  di dalam class record hanya terdapat field atau variabel
	 *  dan method yang sesuai dengan objeknya
	 *  
	 */
	
	String judul; //field judul
	String penulis; //field penulis
	String penerbit; //field penerbit
	int harga; //field harga
	
	/*
	 * karena field harus diakses dari main class, yang jelas-jelas beda 
	 * class, maka untuk mengakses field dari record harus melalui method
	 * 
	 */
	
	public void inputData(String a, String b, String c, int d) {
		//method untuk menginputkan nilai ke dalam field
		judul = a;
		penulis = b;
		penerbit = c;
		harga = d;
	}
	
	public void tampilData() {
		System.out.println("Judul : " + judul);
		System.out.println("Penulis : " + penulis);
		System.out.println("Penerbit : " + penerbit);
		System.out.println("Harga : " + harga);
	}
}
