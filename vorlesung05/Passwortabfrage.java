package aufgaben;

import java.util.Scanner;

public class Passwortabfrage {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 

		int count = 1;
		String pass = "Programmieren";
		do {
			System.out.printf("Bitte geben Sie das Passwort ein - %d. Versuch: ", count);
			String eingabe = sc.nextLine();
			
			if (eingabe.equals(pass)) {
				System.out.print("Zutritt gewährt!");
				break;
			}
			
			count++;
		} while (count <= 3);
		
		if (count > 3) {
			System.out.print("Zutritt verweigert!");	
		}
		
		sc.close();
	}
}
