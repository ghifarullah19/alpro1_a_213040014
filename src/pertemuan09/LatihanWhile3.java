package pertemuan09;

public class LatihanWhile3 {

	public static void main(String[] args) {
		
		int a = 11;
		int b = 11;
		
		while (a <= 10) {
			System.out.println("Pengulangan while ke : " + a);
			a++;
		}
		
		do {
			System.out.println("Pengulangan do ke : " + b);
			b++;
		} while (b <= 10);
	}
}
