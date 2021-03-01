package aufgaben;
import java.util.Scanner;

public class IntervallCheckerB {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
        // Neuen Scanner erstellen
		
		int intervallMin = 10;
		int intervallMax = 20;
		
		System.out.printf("Bitte geben Sie eine Zahl im Intervall [%d,%d] ein: ", intervallMin, intervallMax);
		int input = sc.nextInt();
		
		if ((input >= 10) && (input <= 20)) {
			System.out.printf("Die Zahl %d liegt im Intervall [%d,%d]", input, intervallMin, intervallMax);
		} else {
			System.out.printf("Die Zahl %d liegt NICHT im Intervall [%d,%d]", input, intervallMin, intervallMax);
		}
		
		sc.close();
		// Scanner schließen.
	}
}
