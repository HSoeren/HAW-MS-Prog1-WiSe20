package aufgaben;
import java.util.Scanner;

public class StringGleichheitsChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		System.out.print("Bitte geben Sie ein Wort ein: "); 
        String ersteEingabe = sc.nextLine();
        // Eingabe erfragen und per Scanner in die Variable speichern
        
        System.out.print("Bitte geben Sie das gleiche Wort erneut ein: ");
        String zweiteEingabe = sc.nextLine();
        // Eingabe erfragen und per Scanner in die Variable speichern
        
        boolean ergebnis = ersteEingabe.equals(zweiteEingabe);
        // Überprüft, dass ersteEingabe und zweiteEingabe gleich sind
        
        // boolean einfach = ersteEingabe.equalsIgnoreCase(zweiteEingabe);
        // Überprüft, dass ersteEingabe und zweiteEingabe gleich sind, ignoriert groß und Kleinschreibung
        
        System.out.print("Die Worte sind gleich: " + ergebnis);
        // Ausgabe des Ergebnisses, entweder true oder false
		
		sc.close();
		// Scanner schließen
	}
}
