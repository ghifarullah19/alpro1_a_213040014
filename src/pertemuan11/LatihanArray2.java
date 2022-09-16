package pertemuan11;

public class LatihanArray2 {

	public static void main(String[] args) {
		/*
		 * Karakteristik dari Array mirip dengan variable
		 * akan menampung statement terakhir pada array tersebut
		 * 
		 */
		
		int a = 5;
		a = 10;
		
		int [] arrNilai = new int [5];
		
		arrNilai [0] = 80;
		arrNilai [1] = 70;
		arrNilai [2] = 90;
		arrNilai [3] = 70;
		arrNilai [4] = 90;
		
		System.out.println(arrNilai[2]);
		
		arrNilai = new int [3];
		// Baris ini menjadi deklarasi ulang terhadap arrNilai
		
		System.out.println(arrNilai[2]);
		// Sehingga isi dari arrNilai menjadi 0 kembali
		
		arrNilai [0] = 80;
		arrNilai [1] = 70;
		arrNilai [2] = 90;
		
		System.out.println(arrNilai[1]);
		
		arrNilai [1] = 100;
		
		System.out.println(arrNilai[1]);
	}
}
