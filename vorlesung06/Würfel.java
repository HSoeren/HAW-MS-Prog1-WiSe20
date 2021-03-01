package vorlesung06;
import java.util.Random;
import java.util.Scanner;

enum Seiten {Eins, Zwei, Drei, Vier, F�nf, Sechs};

public class W�rfel {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random zufall = new Random();
		
		do {
			System.out.print("Mein W�rfel zeigt: ");
			System.out.print(Seiten.values()[new Random().nextInt(Seiten.values().length)]);
			System.out.print("\nM�chtest du nochmal w�rfeln? ");
		} while (sc.next().equalsIgnoreCase("j"));
	}	
}
