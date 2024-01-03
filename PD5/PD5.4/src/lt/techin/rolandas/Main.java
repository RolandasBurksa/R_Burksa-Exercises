package lt.techin.rolandas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
Isvedame pradine salyga, inicijuojame kintamuosius
 */
        System.out.println("Ivedus skaiciu 0 skaiciavimas bus sustabdytas.");
        int a;
        int sum = 0;
/*
Formuojame do ciklo salyga
 */
        do {
            System.out.print("Iveskite skaiciu : ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            sum += a;
            System.out.println("Suvestu skaiciu suma = " + sum);
/*
Formuojame isejimo is do ciklo salyga
 */
        } while (a != 0 );
/*
Uzbaigiame programos vykdyma
 */
        System.out.println("Skaiciavimas baigtas.");
        }

    }

