package aufgaben;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FloatDevisionEVA {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        // Neuen Scanner erstellen, Formattierer erstellen
 
        System.out.print("Geben Sie die erste Zahl ein: ");
        float erstezahl = sc.nextFloat();
        // Erste Zahl erfragen und per Scanner in die Variable speichern
 
        System.out.print("Geben Sie die zweite Zahl ein: ");
        float zweitezahl = sc.nextFloat();
        // Zweite Zahl erfragen und per Scanner in die Variable speichern
 
        sc.close();
        // Scanner schlieﬂen
 
        float ergebnis = erstezahl / zweitezahl;
        // Ergebnis ausrechnen (Division der Zahlen)
        System.out.println("Die Division der beiden Zahlen ergibt " + df.format(ergebnis));
        // Ausgabe des formattierten Ergebnisses
    }
}
 