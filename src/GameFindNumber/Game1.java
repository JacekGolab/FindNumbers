package GameFindNumber;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game1 {

	static int getRand(int max, int min) {
		Random rand = new Random();
		int x = rand.nextInt(max - min + 1) + min;
		return x;
	}

	public static void main(String[] args) {

		int goodNumber = getRand(100, 1);
		System.out.println("Zgadnij liczbę:");
		Scanner scan = new Scanner(System.in);

		while (true) {

			try {
				int userChoice = scan.nextInt();
				if (userChoice == goodNumber) {
					System.out.println("Zgadłeś!");
					break;

				} else if (userChoice > goodNumber) {
					System.out.println("Za dużo");

				} else if (userChoice < goodNumber) {
					System.out.println("Za mało");

				}

			} catch (InputMismatchException e) {
				System.out.println("To nie jest liczba. Podaj liczbę:");
				scan.next();
			}

		}

	}

}