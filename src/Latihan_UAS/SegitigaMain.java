package Latihan_UAS;

public class SegitigaMain {

	static void Compare(Segitiga s1, Segitiga s2) {
		if (s1.Luas() > s2.Luas()) {
			System.out.println("Luas yang lebih besar adalah " + s1.Luas());
		} else if (s1.Luas() < s2.Luas()) {
			System.out.println("Luas yang lebih besar adalah " + s2.Luas());
		} else {
			System.out.println("Luas sama");
		}
	}
	public static void main(String[] args) {
		Segitiga A = new Segitiga();
		System.out.println("Segitiga A");
		A.BacaSegitiga();
		A.TulisSegitiga();
		A.Luas();
		System.out.println("Luas: " + A.Luas() + "\n");
		
		Segitiga B = new Segitiga();
		System.out.println("Segitiga B");
		B.BacaSegitiga();
		B.TulisSegitiga();
		B.Luas();
		System.out.println("Luas: " + B.Luas());
		Compare(A, B);
	}
}
