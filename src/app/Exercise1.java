package app;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int[] numbers = new int[5];

		for (int i = 0; i < 5; i++) {
			numbers[i] = randomNumber();

		}

		System.out.print("Array iniziale: ");
		System.out.println(Arrays.toString(numbers));
		arrayInput(numbers);

	}

	public static int randomNumber() {
		return (int) Math.floor((Math.random() * 10) + 1);
	}

	public static void arrayInput(int[] numbers) {
		Scanner sc = new Scanner(System.in);
		int position;
		while (true) {
			try {

				System.out.print("Inserisci la posizione da modificare 1-5 (0 per uscire): ");
				position = sc.nextInt();

				if (position == 0) {
					break;
				}

				System.out.print("Specifica il numero da inserire sulla posizione " + position + ": ");

				int numberInput = sc.nextInt();
				numbers[position - 1] = numberInput;
				System.out.println(Arrays.toString(numbers));

			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Errore: posizione non valida per l'array.");
			} catch (InputMismatchException e) {
				System.err.println("Errore: per favore, inserire un numero intero.");
				sc.nextLine(); // pulisce lo scanner
			}

		}
		sc.close();
	}

}
