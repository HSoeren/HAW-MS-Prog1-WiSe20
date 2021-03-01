package aufgaben;

public class FloatAddition {

    public static void main(String[] args) {
        float ersteZahl = 47.3f;
        float zweiteZahl = 2.3f;
        // beide vorgegebene Zahlen als Variablen definieren
        // das f hinter der Zahl "akzeptiert" den möglichen Verlust an Genauigkeit, da float nicht sehr groß ist.
    
        float ergebnis = ersteZahl + zweiteZahl;
        // Ergebnis als int initialisieren, Addition darin definieren
 
        System.out.print("Das Ergebnis lautet " + ergebnis + ".");
        // Ergebnis ausgeben
    }
}
