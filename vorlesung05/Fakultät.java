package aufgaben;

import java.util.Scanner;

public class Fakult�t {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Geben Sie eine Zahl ein f�r die die Fakult�t berechnet werden soll: ");
		int eingabe = sc.nextInt();
		int ergebnis = 1;
		
		for (int i = 1; i<=eingabe; ++i) {
			ergebnis *= i;
		}
		
		System.out.printf("Die Fakult�t der Zahl %d betr�gt %d", eingabe, ergebnis);
	}
}