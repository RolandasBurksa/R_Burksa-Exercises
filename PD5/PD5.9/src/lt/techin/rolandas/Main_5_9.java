package lt.techin.rolandas;

import java.util.Scanner;

public class Main_5_9 {

    public static void main(String[] args) {
/*
Inicijuojame pradinius kintamuosius, ivedame autobusu skaiciu
 */
        int pradinisAutobusuSkaicius;
        int keleiviuSkMazDes = 0;
        int sumKeleiviu = 0;
        int sumLaiko = 0;
        System.out.print("Iveskite skaiciu, kiek autobusu vyksta kasdien? ");
        Scanner sc = new Scanner(System.in);
        int autobusuSkaicius = sc.nextInt();
        System.out.println("______________________");
/*
Naudodami for cikla suvedame reikalingus duomenis
 */
        for (pradinisAutobusuSkaicius = 1; pradinisAutobusuSkaicius <= autobusuSkaicius; pradinisAutobusuSkaicius++) {
            System.out.print("Iveskite - " + pradinisAutobusuSkaicius + " autobuso vaziavimo laika pilnomis valandomis: ");
            Scanner scv = new Scanner(System.in);
            int laikasValandomis = scv.nextInt();

            System.out.print("Iveskite - " + pradinisAutobusuSkaicius + " autobuso vaziavimo likusi laika minutemis: ");
            Scanner scm = new Scanner(System.in);
            int laikasMinutemis = scm.nextInt();

            System.out.print("Iveskite kiek keleiviu vaziavo - " + pradinisAutobusuSkaicius + " autobusu: ");
            Scanner sck = new Scanner(System.in);
            int keleiviuSkaicius = sck.nextInt();
            System.out.println("______________________");
/*
Naudodami if funkcija skaiciuojame visus autobusus kur keleiviu skaicius < 10
 */
            if (keleiviuSkaicius < 10) {
                keleiviuSkMazDes++;
            }
/*
Skaiciujame bendra keliones laika ir bendra keleiviu skaiciu
 */
            sumLaiko += (laikasValandomis * 60) + laikasMinutemis;
            sumKeleiviu += keleiviuSkaicius;
        }
/*
Skaiciuojame ir isvedame reikalingus duomenis
 */
        System.out.println("Bendrai perveztu keleiviu skaicius = " + sumKeleiviu);
        System.out.println("Vidutinis sugaistas vaziavimo laikas (min.) = " + (sumLaiko / autobusuSkaicius));
        System.out.println("Autobusu skaicius (keleiviai < 10) = " + keleiviuSkMazDes);
    }
}
