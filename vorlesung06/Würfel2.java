package vorlesung06;
import java.util.Random;
import java.util.Scanner;

enum WuerfelEnum {Eins, Zwei, Drei, Vier, F�nf, Sechs};

public class W�rfel2 {
	public static void main(String args[]) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		WuerfelEnum[] meinWuerfel = WuerfelEnum.values();
		System.out.println();
		
		do {
			int index = random.nextInt(meinWuerfel.length);
			System.out.println("\tMein W�rfel zeigt: " + meinWuerfel[index]);
			System.out.print("\tM�chten Sie nochmal w�rfeln? (j/n) \t");
		} while (sc.next().equalsIgnoreCase("j"));
		sc.close();
	}

}
