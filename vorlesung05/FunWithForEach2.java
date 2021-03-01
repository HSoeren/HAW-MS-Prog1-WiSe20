package aufgaben;

public class FunWithForEach2 {
	public static void main(String[] args) throws Exception {
        int[] arr = {1, 5, 2, 5, 7};

        int anzahl = arr.length;

        int summe = 0;
        for (int value : arr)
            summe += value;
        
        int gerade = 0;
        int ungerade = 0;        
        for (int zahl : arr)
            if (zahl % 2 == 0)
                gerade++;
            else
                ungerade++;

        // Bubble Sort des Arrays
        int temp = 0;
        for (int i = 0; i < arr.length; ++i) {
        	for (int j = 1; j < (arr.length - i); ++j) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j] + arr[j - 1];
                    arr[j] = temp;
                }
            }
        }

        int a = 0, duplikat = 0;
        int previous = -1;
        for (int zahl : arr)
            if (zahl == previous) {
                a++;
                if (a == 1)
                    ++duplikat;
            } else {
                previous = zahl;
                a = 0;
            }

        // Ausgabe der Werte
        System.out.printf("Anzahl beträgt: %d, Summe beträgt: %d, Anzahl gerader Zahlen: %d, Zahl Duplikate: %d", anzahl, summe, gerade, duplikat);
    }
}
