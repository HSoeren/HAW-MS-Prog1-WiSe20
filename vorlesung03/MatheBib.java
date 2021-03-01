package aufgaben;
import java.util.Scanner;

public class MatheBib {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		System.out.print("Geben Sie eine Ganzzahl ein: "); 
        int ersteZahl = sc.nextInt();
        // Erste Zahl erfragen und per Scanner in die Variable speichern
 
        System.out.print("Geben Sie eine zweite Ganzzahl ein: ");
        int zweiteZahl = sc.nextInt();
        // Zweite Zahl erfragen und per Scanner in die Variable speichern
		
		System.out.println("Die Absolutwerte sind: " + Math.abs(ersteZahl) + " und " + Math.abs(zweiteZahl) );
		// Ausgabe und Berechnung der Absolutwerte.
		
		int kleinereZahl = Math.min(ersteZahl, zweiteZahl);
		System.out.println("Die kleinere Zahl ist: " + kleinereZahl );
		// Berechnung der kleineren Zahl als eigene Variable
		// Ausgabe der kleineren Zahl
		
		System.out.println("Die Multiplikation der Zahlen ergibt: " + ersteZahl*zweiteZahl);
		// Berechnung und Ausgabe der Multiplikation
		
		sc.close();
		// Scanner schlieﬂen
	}
}
