package GameFindNumber2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game2 {

	static int inputInt() {
		int result = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				result = scan.nextInt();
				break;
			} catch (InputMismatchException error1) {
				System.out.println("Podałeś niepoprawną liczbę.");
				scan.next();
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w max. 10 próbach.");
		
		int min=0;
		int max = 1000;
		
		System.out.println("Naciśnij klawisz 'w', jeśli cyfra, którą wyświetlę jest "
						 + "mniejsza od Twojej lub naciścij 'm', jeśli jest ona większa."
						 + '\n' + "Jeżeli odgadnę - wciśnij 'z'!");
		
		String answer="";
		int quantity = 0;
		
		while (true) {
			int guess=(min+max)/2;
			System.out.println(String.format("Zgaduję %d?", guess));
			answer=scan.next();
			
			if (quantity >= 10) {
				min=0;
				max = 1000;
				System.out.println("Nie oszukuj!!!");
				quantity = 0;
			}
			
			if (answer.equals("w")) {
				min=guess;
				quantity++;
				
			}else if (answer.equals("m")) {
				max=guess;
				quantity++;
				
			} 
			else if (answer.equals("z")) {
				System.out.println("Wygrałem!");
				break;
			}
			else {
				System.out.println("Czy wpisałaś/eś ustaloną literkę? Spróbuj jeszcze raz!");
			}
		}
	}

}