package aufgaben;

public class BitShifter {
	public static void main(String args[]) {
		int count = 1;
		int i = 1;
		while (count <= 10) {
			System.out.printf("%d. Durchlauf: %d %n", count, i);
			i = i << 1;
			count++;
		}
	}
}
