package aufgaben;
import java.util.Scanner;

public class Hauptprogramm {
	public static void main(String[] args) {
		Konto meinKonto = new Konto();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Ihr Name: \t");
		meinKonto.benutzer = sc.next();
		System.out.printf("Kontostand: \t");
		meinKonto.kontostand = sc.nextFloat();
		
		System.out.println("Ihr Name lautet: " + meinKonto.benutzer);
		System.out.println("Ihr Kontostand beträgt: " + meinKonto.kontostand);
		
		meinKonto.setKontostand(800);
		System.out.println("Ausgabe: " + meinKonto.getKontostand());
		
		System.out.println(meinKonto.toString());
				
		sc.close();
	}
}
