package aufgaben;
import java.util.Scanner;

public class AbschreibeTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		System.out.println("Bitte tippen Sie - Hallo Welt "); 
        String eingabe = sc.nextLine();
        // Eingabe erfragen und per Scanner in die Variable speichern
        
        if (!eingabe.equals("Hallo Welt")) {
        	System.out.println("Die Eingabe war nicht korrekt");
        	// Eingabe wird überprüft, beachte das NOT davor. Dann wird der Fehler ausgegeben.
        }
        	
		sc.close();
		// Scanner schließen
	}
}
