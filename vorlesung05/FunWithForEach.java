package aufgaben;

public class FunWithForEach {
	public static void main (String[] args) throws java.lang.Exception {
		int[] arr = {1, 5, 2, 5, 7};
		
		int anzahl = 0;
		anzahl = arr.length;
		
		int summe = 0;
		for (int value : arr) {
			summe += value;
		}
		
		int gerade = 0;
		int ungerade = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				gerade++;
			} else {
				ungerade++;
			}
		}
		
		int temp = 0;
		for (int i=0; i < arr.length; ++i) {
		    for (int j=1; j < (arr.length - i); ++j) {
		        if (arr[j-1] > arr[j]) {
		            temp = arr[j-1];
		            arr[j-1] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		int a = 0, duplikat = 0;
		int previous = -1;
		for (int i=0; i < arr.length; ++i) {
		    if (arr[i] == previous) {
		        ++a;
		        if (a == 1) {
		            ++duplikat;
		        }
		    }
		    else {
		        previous = arr[i];
		        a = 0;
		    }
		}
		
		System.out.printf("Anzahl beträgt: %d, Summe beträgt: %d, Anzahl gerader Zahlen: %d, Zahl Duplikate: %d", anzahl, summe, gerade, duplikat);
	}
}
