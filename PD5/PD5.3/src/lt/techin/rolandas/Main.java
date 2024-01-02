package lt.techin.rolandas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Ivedame skaiciu
 */
        System.out.print("Iveskite teigiama sveika skaiciu: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
/*
Formuojame isorini cikla
 */
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;       // Ivedame palyginimo salyga
            for (int j = 2; j <= i / 2 ; j++) {

                if (i % j == 0) {         // Jeigu salyga ispildoma, skaicius ne pirminis, traukiame cikla
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {                // Priesingu atveju skaicius pirminis, isvedame skaiciu
                System.out.println("Yra pirminis = " + i);
            }
        }
    }
}
