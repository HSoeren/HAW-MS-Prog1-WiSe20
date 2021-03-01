package aufgaben;
import java.util.Scanner;

public class TemperaturUmrechner {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		System.out.print("Geben Sie eine Temperatur in Grad Celsius ein: "); 
        float celsius = sc.nextFloat();
        // Temperatur in Celsius erfragen und per Scanner in die Variable speichern
        
        float fahrenheit = (celsius * 9/5 ) + 32;
        
        float kelvin = celsius + 273.15f;
        
        StringBuilder ausgabe = new StringBuilder("")
        		.append(celsius + "∞C entsprechen " + fahrenheit + "∞F und " + kelvin +"K.");
        // Alle Daten und Zwischenergebnisse sammeln und in einem Gesamtstring speichern.
        
        System.out.print(ausgabe);
        // Fertigen String ausgeben
        
		sc.close();
		// Scanner schlieﬂen
	}
}
