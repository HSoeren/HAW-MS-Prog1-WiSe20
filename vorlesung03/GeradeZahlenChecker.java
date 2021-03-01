package aufgaben;
import java.util.Scanner;

public class GeradeZahlenChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		System.out.print("Geben Sie eine gerade Ganzzahl ein: "); 
        int zahl = sc.nextInt();
        // Zahl erfragen und per Scanner in die Variable speichern
		
        boolean ergebnis = (zahl%2) == 0;
        // Berechnung des Ergebnisses
        
        System.out.print("Die Zahl ist wirklich gerade: " + ergebnis);
        // Ausgabe des Ergebnisses, entweder true oder false
		
		sc.close();
		// Scanner schließen
	}
}
