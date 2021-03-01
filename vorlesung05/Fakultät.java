package aufgaben;

import java.util.Scanner;

public class Fakultät {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Geben Sie eine Zahl ein für die die Fakultät berechnet werden soll: ");
		int eingabe = sc.nextInt();
		int ergebnis = 1;
		
		for (int i = 1; i<=eingabe; ++i) {
			ergebnis *= i;
		}
		
		System.out.printf("Die Fakultät der Zahl %d beträgt %d", eingabe, ergebnis);
	}
}