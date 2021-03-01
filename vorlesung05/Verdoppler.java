package aufgaben;

public class Verdoppler {
	public static void main(String args[]) {
		int i = 1;
		System.out.print(i);
		while (i <= 128) {
			i = i * 2;
			System.out.printf(", %d",i);
		}
	}
}
