package vorlesung06;
import java.util.Random;
import java.util.Scanner;

enum WuerfelEnum {Eins, Zwei, Drei, Vier, Fünf, Sechs};

public class Würfel2 {
	public static void main(String args[]) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		WuerfelEnum[] meinWuerfel = WuerfelEnum.values();
		System.out.println();
		
		do {
			int index = random.nextInt(meinWuerfel.length);
			System.out.println("\tMein Würfel zeigt: " + meinWuerfel[index]);
			System.out.print("\tMöchten Sie nochmal würfeln? (j/n) \t");
		} while (sc.next().equalsIgnoreCase("j"));
		sc.close();
	}

}
