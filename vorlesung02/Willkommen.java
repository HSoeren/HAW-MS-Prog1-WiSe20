package aufgaben;
import java.util.Scanner;

public class Willkommen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Neuen Scanner erstellen
 
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = sc.next();
        // Namen erfragen und in der Variable speichern
 
        sc.close();
        // Scanner schlieﬂen
 
        System.out.print("Hallo und Herzlich Willkommen, " + name + ".");
        // Ausgabe des Ergebnisses
    }
}
