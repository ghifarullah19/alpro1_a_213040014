package pertemuan05;

public class operatorBoolean {

	public static void main(String [] args) {
		
		int a, b;
		a = 5;
		b = 5;
		System.out.println(a == b); // = ditulis dua kali (==)
		System.out.println(a != b); // ! artinya tidak
		
		a = 5;
		b = 5;
		System.out.println(a < b); // < artinya {4, 3, 2, ...}
		System.out.println(a <= b); // <= artinya {5, 4, 3, 2, ...}
		
		a = 5;
		b = 5;
		System.out.println(a > b); // > artinya {6, 7, 8, ...}
		System.out.println(a >= b); // >= artinya {5, 6, 7, 8, ...}
		
		String nama1, nama2;
		nama1 = "Bruno";
		nama2 = "bruno";
		
		System.out.println(nama1.equals(nama2)); //case sensitif
		System.out.println(nama1.equalsIgnoreCase(nama2)); //non-case sensitif
	}
}
