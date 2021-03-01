package aufgaben;
import java.util.Scanner;

public class Zahlenschreiber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		System.out.print("Bitte geben Sie eine Zahl zwischen 1 und 5 ein: "); 
        int eingabe = sc.nextInt();
        
        // Switch für Arme.
        if (eingabe == 1) {
        	System.out.println("Eins");
        } else if (eingabe == 2) {
        	System.out.println("Zwei");
        } else if (eingabe == 3) {
        	System.out.println("Drei");
        } else if (eingabe == 4) {
        	System.out.println("Vier");
        } else if (eingabe == 5) {
        	System.out.println("Fünf");
        } else {
        	System.out.println("ungültige Zahl");
        }
        
        sc.close();
        // Scanner schließen
	}
}
