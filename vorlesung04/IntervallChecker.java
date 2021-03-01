package aufgaben;
import java.util.Scanner;

public class IntervallChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		System.out.println("Geben Sie eine Zahl zwischen [10,20] ein:");
		int eingabe = sc.nextInt();
		// Eingabe erfragen und per Scanner in die Variable speichern
		
		if ((eingabe < 10 ) || (eingabe > 20)) {
        	System.out.printf("%S", eingabe + " liegt nicht im Intervall [10,20]");
        	// %S sorgt dafür, dass die Ausgabe in CAPS erfolgt.
        } else {
			System.out.printf(eingabe + " liegt im Intervall [10,20]");
		}
		
		sc.close();
		// Scanner schließen.
	}
}
