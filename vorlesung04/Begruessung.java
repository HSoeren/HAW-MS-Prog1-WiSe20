package aufgaben;
import java.util.Scanner;

public class Begruessung {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Bitte geben Sie ihren Vornamen ein: "); 
        String vorname = sc.nextLine();
        
        System.out.println("Bitte geben Sie ihren Nachnamen ein: ");
        String nachname = sc.nextLine();
        
        System.out.println("Bitte geben Sie ihr Geschlecht (m/w) ein ");
        String geschlecht = sc.nextLine();
        
        System.out.println("Darf ich Sie duzen (ja/nein)");
        String duzen = sc.nextLine();
        
        StringBuilder ausgabe = new StringBuilder("");
        
        if (duzen.equalsIgnoreCase("ja")) {
        	// Du-Form
        	ausgabe.append("Hallo " + vorname + ", ich heiﬂe Dich herzlich willkommen!");
        } else {
        	// Sie-Form
        	ausgabe.append("Guten Tag ");
        	if (geschlecht.equalsIgnoreCase("m")) {
        		ausgabe.append("Herr ");
        	} else {
        		ausgabe.append("Frau ");
        	}
    		ausgabe.append(nachname + ", ich heiﬂe Sie willkommen!");
        }
        
        System.out.println(ausgabe);
        
        sc.close();
        // Scanner schlieﬂen
	}
}
