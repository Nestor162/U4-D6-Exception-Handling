package app;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		System.out.print("Inserire il numero di kilometri percorsi: ");
		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();

		System.out.print("Inserire il numero di litri dicarburante consumati: ");
		int l = sc.nextInt();

		try {
			int result = km / l;
			System.out.println(result + "km/l");
		} catch (ArithmeticException e) {
			System.err.println("Non è possibile dividere per 0");
		}
	}

}
