package aufgaben;
import java.util.Scanner;

public class NotenChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		System.out.print("Bitte geben Sie eine Zahl zwischen 1 und 5 ein: "); 
        int eingabe = sc.nextInt();
        
        switch (eingabe) {
        case 1,2,3,4:
        	System.out.println("Sie haben bestanden!");
        	break;
        case 5,6:
        	System.out.println("Sie haben nicht bestanden!");
        	break;
        default:
        	System.out.println("Fehlerhafte Eingabe!");
        	break;
        }
        
        sc.close();
        // Scanner schlieﬂen
	}
}
