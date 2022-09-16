package pertemuan10;

public class LatihanBreakDanContinue {

	public static void main(String[] args) {
		/*
		 * function break dan continue
		 * 
		 * break = rem paksa 
		 * sehingga pengulangan akan dipaksa berhenti jika 
		 * menemukan fungsi break
		 * 
		 * continue = skip
		 * pengulanan akan melakukan skip pada putaran
		 * tertentu saat bertemu dengan continue
		 */
		
		for (int a = 1; a <= 100; a++) {
			if (a == 46) {
				break;
			}
			System.out.println(a);
		}
		
		System.out.println("++++++++++");
		
		for (int a = 1; a <= 20; a++) {
			if (a % 2 != 0) {
				continue;
			}
			System.out.println(a);
		}
		
		System.out.println("++++++++++");
		
		for (int a = 1; a <= 20; a++) {
			if (a % 2 != 0) {
				continue;
			}
			if (a == 12) {
				break;
			}
			System.out.println(a);
		}
		
		System.out.println("++++++++++");
		
		for (int a = 1; a <= 20; a++) {
			if ((a == 6) || (a == 9) || (a == 12)) {
				continue;
			}

			System.out.println(a);
		}		
	}
}
