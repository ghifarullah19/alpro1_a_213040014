package pertemuan11;

public class LatihanArray1 {

	public static void main(String[] args) {
		/*
		 * array adalah struktur data, di mana fungsinya
		 * seoerti variable, tetapi dapat manmpung banyak nilai.
		 * 
		 * format dari pembuatan array adalah :
		 * 
		 * tipedata [] namaArray = new tipedata [jumlah elemen]
		 * 
		 * di mana index array diawali dari 0
		 * 
		 * untuk memasukan nilai kedalam array
		 * 
		 * namaArray [indeks ke berapa] = nilai yang ingin diinputkan
		 */
		
		String [] arrNama = new String [5];
		// Kita memiliki array tipedata String dengan jumlah elemen 5
		
		
		arrNama [0] = "Alif";
		arrNama [1] = "Malwi";
		arrNama [2] = "Aufa";
		arrNama [4] = "Revina";
		
		System.out.println(arrNama[4]);
		System.out.println(arrNama[3]);
		
		int [] arrNilai = {60, 80, 65, 70};
		
		System.out.println(arrNilai[1]);
		
		String [] arrKuliah = {"Alpro1", "PW", "Probstat", "PBD"};
		
		System.out.println(arrKuliah[3]);
	}
}
