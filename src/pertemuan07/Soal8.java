package pertemuan07;

public class Soal8 {

		public static void main(String [] args) {
			
			int a = 0, b = 0, c = 0; //a = 0, b = 0, c = 0
			a = 9;	//a = 9, b = 0, c = 0
			b = 10; //a = 9, b = 10, c = 0
			c = a + b;  //a = 9, b = 10, c = 19
			System.out.println(c); //a = 9, b = 10, c = 19, nilai C yaitu 19 ditampilkan ke layar
			
			a = 5; //a = 5, b = 10, c = 19
			c -= 15; //a = 5, b = 10, c = 4
			System.out.println(c); //a = 5, b = 10, c = 4, nilai C yaitu 4 ditampilkan ke layar
			
			b = 2; //a = 5, b = 2, c = 14
			c = a * b; //a = 5, b = 2, c = 10
			c = 10; //a = 5, b = 2, c = 10
			System.out.println(c); //a = 5, b = 2, c = 10, nilai C yaitu 10 ditampilkan ke layar
		}
}
