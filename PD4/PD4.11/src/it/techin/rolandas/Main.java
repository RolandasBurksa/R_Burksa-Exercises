package it.techin.rolandas;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
/*
Ivedame duomenis reikalingus skaiciavimams
 */
        System.out.print("Iveskite skaiciu, kiek zuvu siuo metu gyvena akvariume? ");
        Scanner sc = new Scanner(System.in);
        int zuvuAkvSkaicius = sc.nextInt();
        System.out.print("Iveskite skaiciu, kiek zuvu buvo ideta i akvariuma siandien? ");
        Scanner sc1 = new Scanner(System.in);
        int zuvuIdetuSkaicius = sc1.nextInt();
        System.out.print("Iveskite skaiciu nurodanti, kiek dienu buvo dedamos zuvys? ");
        Scanner sc3 = new Scanner(System.in);
        int dienuSkaicius = sc3.nextInt();
/*
Atliekame skaiciavimus su ivestais duomenimis ir isvedame rezultata.
 */
        System.out.println("______________________________");
        System.out.println("Kadangi, akvariume jau yra: " + zuvuAkvSkaicius + " zuvys ir i ji kasdiena bus dedama " + zuvuIdetuSkaicius + " zuvu,");
        System.out.println("atlike skaiciavimus, t.y. akvariume esanti zuvu skaiciu, \nsudeje su kasdiena papildomai idedamu zuvu skiciaus ir dienu sandauga");
        System.out.println("gauname, kad po " + dienuSkaicius + " dienu, kasdiena idedant po " + zuvuIdetuSkaicius + " zuvis, akvariume bus " + (zuvuAkvSkaicius + (zuvuIdetuSkaicius * dienuSkaicius)) + " zuvu.");
    }
}
