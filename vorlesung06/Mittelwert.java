package vorlesung06;

import java.util.Scanner;

public class Mittelwert {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		double summe = 0;
		
		System.out.print("Anzahl der Messwerte: ");
		int anzahl = sc.nextInt();
		
		double[] messwerte = new double[anzahl];
		
		for (int i = 0; i < messwerte.length; i++) {
			System.out.print("\t" + (i+1) + ". Messwert: ");
			messwerte[i] = sc.nextDouble();
			summe+=messwerte[i];
		}
		
		sc.close();
		System.out.printf("\tMittelwert: %.2f", (summe/anzahl));
	}
}
