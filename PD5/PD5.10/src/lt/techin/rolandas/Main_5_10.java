package lt.techin.rolandas;

import java.util.Scanner;

public class Main_5_10 {

    public static void main(String[] args) {
/*
Inicijuojame kintamuosius, suvedame pradinius duomenis
 */
        int i;
        System.out.print("Iveskite pirmaji intervalo skaiciu n: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.print("Iveskite antraji, didesni uz n,  intervalo skaiciu m: ");
        Scanner scm = new Scanner(System.in);
        int m = scm.nextInt();
        System.out.println(" n = " + n + ", m = " + m);
        System.out.println("______________________");
/*
Inicijuojame cikla nurodytu intervalu, skaiciuojame ar paskutinis skaitmuo != 3,
 ir ar dalijasi is 3 be liekanos, jeigu taip, isvedame rezultata
 */
        for (i = n; i <= m; i++) {
            if ((i % 10 != 3) && (i % 3 == 0)) {
                System.out.println("Intervalo skaiciai: " + i);
            }
        }
    }
}



