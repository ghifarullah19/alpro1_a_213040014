package pertemuan08;

public class LatihanFor6 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		int n = 10;
		
		for (; i <= n; i++) {
			System.out.println("Nilai i adalah " + i);
			sum += i;
			System.out.println("Nilai sum adalah " + sum);
			System.out.println();
		}
		System.out.println("Hasil akhir sum adalah " + sum);
	}
}
