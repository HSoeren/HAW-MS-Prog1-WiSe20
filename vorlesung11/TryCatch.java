package aufgaben;

public class TryCatch {
	public static void main (String [] args) {
		int a = 5;
		int b = 0;
		
		//System.out.println(a/b);
		
		try {
			System.out.println(a / b);
		}
		catch (ArithmeticException Null){
			System.out.println("Division durch 0 ist nicht möglich");
		}
	}
}
