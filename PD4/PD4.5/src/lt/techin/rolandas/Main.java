package lt.techin.rolandas;

import java.util.Scanner;

public class Main {
/*
Sukuriame klases Main metoda, ivedame pirma kintamaji
 */
    public static void main(String[] args) {
        System.out.print("Iveskite pirma sveika skaiciu a nuo 1 iki 100: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
/*
Ivedame antra kintamaji
 */
        System.out.print("Iveskite antra sveika skaiciu b nuo 1 iki 100: ");
        Scanner sc1 = new Scanner(System.in);
        String b = sc1.nextLine();
/*
Keiciame kintamojo tipa is String i int
 */
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int max;

        max = (c > d) ? c : d;  // Panaudotas ternary operatorius
/*
Isvedame ivestus kintamuosius ir ternary operatoriaus pritaikymo rezultata
 */
        System.out.println("Jus ivedete a = " + a + " ir b = " + b);
        System.out.println("Maksimalus jusu ivestas skaicius = " + max);

    }

}
