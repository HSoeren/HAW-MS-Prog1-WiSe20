/* Sören Helms <soeren.helms@haw-hamburg.de> 30.01.2021 */

package aufgaben;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Programm {
	public static void main (String args[]) {		
		ArrayList<Integer> zahlen = new ArrayList<Integer>();
		// ein Array für Zahlen des Typs Integer wird angelegt
		Scanner sc = new Scanner(System.in);
		// Neuer Scanner sc angelegt
		
		System.out.printf("Wieviel Zahlen sollen eingegeben werde: ");
		int arraysize = sc.nextInt();
		// Die Arraygröße wird abgefragt und gespeichert
		
		for (int i = 0; i < arraysize; i++) {
			System.out.printf("Zahl %d : ", i+1);
			int zahl = sc.nextInt();
			zahlen.add(zahl);
		}
		// Die Zahlen werden abgefragt und im Array gespeichert
		
		sc.close();
		// Scanner schließen
		
		System.out.println("Array-Inhalt: ");
		for (int i : zahlen) {
			System.out.printf("%d ", i);
		}
		// ..und hier wieder ausgegeben
		
		System.out.println();
		shuffle(zahlen, arraysize);
		
		System.out.println();
		selection(zahlen, arraysize);
		
		System.out.println();
		bubblesort(zahlen, arraysize);
		
		System.out.println();
		insertionsort(zahlen, arraysize);
		
	}
	
	// Aufgabe 2 - Shuffle Algorithmus
	static void shuffle(ArrayList<Integer> list, int count) {
		Random random = new Random();
		
		int i = random.nextInt(count);
		int j = random.nextInt(count);
		
		if (i == j) { j = random.nextInt(count); }
		// Stellt sicher, dass i und j nicht zufällig den gleichen Wert haben
		
		int temp;
		// temp wird als Variable initialisiert um den Tausch der Werte zu ermöglichen
		temp = list.get(i);
		// temp übernimmt den Wert von dem Arrayelement i
		list.set(i, list.get(j));
		// Das Arrayelement i übernimmt den Wert von Arraayelement j
		list.set(j, temp);
		// Das Arrayelement j übernimmt den Wert von Arrayelement i welches in temp gelagert wurde
		
		System.out.println("Zufällige Anordnung: ");
		for (int x : list) {
			System.out.printf("%d ",x);
		}
	}
	
	// Aufgabe 3 - Selection Sort
	static void selection(ArrayList<Integer> list, int count) {
		int temp;
		
		for (int i = 0; i < count -1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (list.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		System.out.println("Selektierte Anordnung: ");
		for (int x : list) {
			System.out.printf("%d ", x);
		}

	}
	
	// Aufgabe 4 - Bubblesort
	static void bubblesort(ArrayList<Integer> list, int count) {
		
		boolean sort;
		int i;
		int temp;
		
		do {
			sort = false;
			for (i = 0; i < count - 1; i++) {
				if (list.get(i) > list.get(i+1)) {
					sort = true;
					temp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
				}
			}
		}
		while (sort);
		/* Die Liste wird durchgegangen, nach einem Wert gesucht, der nicht 
		 * passt und dann getauscht. Wie in Aufgabe 2, über die Variable temp.
		 * Am Anfang jedes Durchlaufes wird die Variable 'sort' auf false gesetzt,
		 * sobald etwas gefunden und getauscht werden muss, wird sie auf true gesetzt.  
		 * Am Ende wird der Status von sort geprüft, sobald er true ist (also ein 
		 * Durchlauf ohne Umsortieren geklappt hat) wird abgebrochen.
		 */
		
		System.out.println("Sortierte Anordnung: ");
		for (int x : list) {
			System.out.printf("%d ", x);
		}
	}

	// Aufgabe 5 - Insertion Sort
	static void insertionsort(ArrayList<Integer> list, int count) {
		
		int temp;
		for (int i = 0; i < count; i++) {
			temp = list.get(i);
			int j = i;
			while (j > 0 && list.get(j-1) > temp) {
				list.set(j, list.get(j-1));
				j--;
			}
			list.set(j, temp);
		}
		
		/* Geht durch das Array nimmt eine Zahl und bringt sie durch einzelnes vergleichen
		 * mit den enthaltenenen Zahlen an die richtige Position im Array
		 */
		
		System.out.println("Eingefügte Anordnung: "); // schlechte Bezeichnung?
		for (int x : list) {
			System.out.printf("%d ", x);
		}
	}	
}
