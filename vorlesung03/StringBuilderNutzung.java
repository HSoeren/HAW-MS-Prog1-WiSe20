package aufgaben;
import java.util.Scanner;

public class StringBuilderNutzung {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		System.out.print("Bitte geben Sie ihren Vornamen ein: "); 
        String vorname = sc.nextLine();
        // Eingabe erfragen und per Scanner in die Variable speichern
        
        System.out.print("Bitte geben Sie ihren Nachnamen ein: ");
        String nachname = sc.nextLine();
        // Eingabe erfragen und per Scanner in die Variable speichern

        System.out.print("Bitte geben Sie ihr Geburtsdatum ein: ");
        String geburtsdatum = sc.nextLine();
        // Eingabe erfragen und per Scanner in die Variable speichern
        
        StringBuilder ausgabe = new StringBuilder(vorname)
        		.append(" ")
        		.append(nachname)
        		.append("; ")
        		.append(geburtsdatum)
        		.append(";");
        
        System.out.print(ausgabe);
        // Gibt den fertigen String aus
        
        sc.close();
        // Scanner schlieﬂen
	}
}
