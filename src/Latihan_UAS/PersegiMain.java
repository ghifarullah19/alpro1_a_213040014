package Latihan_UAS;

public class PersegiMain {

	static void Compare(Persegi p1, Persegi p2) {
		if (p1.LuasPersegi() > p2.LuasPersegi()) {
			System.out.println("Luas Persegi 1 lebih besar");
		} else if (p1.LuasPersegi() < p2.LuasPersegi()) {
			System.out.println("Luas Persegi 2 lebih besar");
		} else {
			System.out.println("Luas persegi sama");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Persegi A");
		Persegi A = new Persegi();
		A.BacaPersegi();
		A.TulisPersegi();
		A.LuasPersegi();
		System.out.println(A.LuasPersegi() + "\n");
		
		System.out.println("Persegi B");
		Persegi B = new Persegi();
		B.BacaPersegi();
		B.TulisPersegi();
		B.LuasPersegi();
		System.out.println(B.LuasPersegi());
		Compare(A, B);
	}
}
