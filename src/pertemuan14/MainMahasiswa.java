package pertemuan14;

public class MainMahasiswa {
	
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa();
		
		mhs.inputData("Muhammad Lutfi", "213040014", "A", 4.00);
		
		System.out.println(mhs.tampilIPK());
	}

}
