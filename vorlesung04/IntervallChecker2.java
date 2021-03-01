package aufgaben;
import java.util.Scanner;

public class IntervallChecker2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		int min = 10;
		int max = 20;
		String zusatz = "";
		
		System.out.println("Geben Sie eine Zahl zwischen [10,20] ein:");
		int eingabe = sc.nextInt();
		// Eingabe erfragen und per Scanner in die Variable speichern
		
		if (eingabe < min) {
			zusatz = "unterhalb";
		} else { 
			if (eingabe > max) {
			zusatz = "oberhalb";
			} else {
			zusatz = "innerhalb";
			}
		}
		
		System.out.printf(eingabe + " liegt " + zusatz + " des Intervalls [%d,%d]", min, max);
		
		sc.close();
		// Scanner schlieﬂen.
	}
}
