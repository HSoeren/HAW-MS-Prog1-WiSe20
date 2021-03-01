package vorlesung06;
import java.util.Random;
import java.util.Scanner;

enum Seiten {Eins, Zwei, Drei, Vier, Fünf, Sechs};

public class Würfel {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random zufall = new Random();
		
		do {
			System.out.print("Mein Würfel zeigt: ");
			System.out.print(Seiten.values()[new Random().nextInt(Seiten.values().length)]);
			System.out.print("\nMöchtest du nochmal würfeln? ");
		} while (sc.next().equalsIgnoreCase("j"));
	}	
}
