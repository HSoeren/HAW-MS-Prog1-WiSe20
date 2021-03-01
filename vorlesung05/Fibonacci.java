package aufgaben;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int wert1 = 1;
        int wert2 = 1;
        int werte;
         
        System.out.print("Wie viele Werte sollen ausgegeben werden? ");
        werte = sc.nextInt();
         
        System.out.print(wert1 + " ");
        System.out.print(wert2 + " ");
             
        for(int i = 2; i < werte; i++) {
            int temp = wert1 + wert2;
            wert1 = wert2;
            wert2 = temp;
                 
            System.out.print(wert2 + " ");
        }
        sc.close();
	}
}


