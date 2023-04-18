package nicotheeagle.codewars.kata81;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bio b = new Bio();
		String dna;
		
		System.out.println("Inserire 4 caratteri tra 'G' 'C' 'A' 'T':");
		dna = sc.nextLine();
		sc.close();
		System.out.println("La tua nuova stringa è: " + b.dnaToRna(dna));
	}

}
