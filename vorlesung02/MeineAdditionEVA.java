package aufgaben;
import java.util.Scanner;

public class MeineAdditionEVA {
	public static void main(String args[]) {
		 
        Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
 
        System.out.print("Geben Sie die erste Zahl ein: "); 
        int erstezahl = sc.nextInt();
        // Erste Zahl erfragen und per Scanner in die Variable speichern
 
        System.out.print("Geben Sie die zweite Zahl ein: ");
        int zweitezahl = sc.nextInt();
        // Zweite Zahl erfragen und per Scanner in die Variable speichern
 
        sc.close();
        // Scanner schlieﬂen
 
        int ergebnis = erstezahl + zweitezahl;
        // Ergebnis ausrechnen (Addition beider Zahlen)
 
        System.out.println("Die Summe der beiden Zahlen ist " + ergebnis);
        // Ausgabe des Ergebnisses
    }
}