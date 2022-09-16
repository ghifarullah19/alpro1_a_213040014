package pertemuan13;

public class LatihanMethod1 {
	
	/*
	 * Method adalah sub program atau bagian dari 
	 * program, yang beradaa di dalam kelas tetapi 
	 * di luar main method
	 * 
	 * format penulisannya adalah
	 * 
	 * public tipedata namaMethod (parameter) {
	 * 	isi method;
	 * 	return value; //khusus function
	 * }
	 * 
	 * method terdapat dua jenis
	 * 1. prosedur (introvert), prosedur tidak akan mengeluarkan hasil
	 * proses di dalamnya ke luar.
	 * 2. fungsi (extrovert), hasil yang dihasilkan olehnya akan dishare
	 * melalui yang dinamakan return value.
	 * 
	 * karakteristik pros atau func akan mempengaruhi tipedata yang digunakan
	 * saat pembuatan method
	 * karena prosedur bersifat introvert, maka tipedata yang digunakan adalah 
	 * void
	 * function tipedata yang digunakan menggunakan tipedata yang umum, seperti 
	 * string, int, dkk. tipedata yang digunakan disesuaikan dengan nilai 
	 * yang akan direturn 
	 */
	
	public static void tampilNama() { //prosedur
		System.out.println("Halo nama saya siapa ya?");
	}
	
	// 
	
	public static void main(String[] args) {
		tampilNama();
		String alamat = tampilAlamat();
		System.out.println(alamat);
	}
	
	//
	public static String tampilAlamat() { //function
		return "Jl. Setiabudhi 193";
	}
}
