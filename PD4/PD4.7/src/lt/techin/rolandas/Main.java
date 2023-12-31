package lt.techin.rolandas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*
Ivedame paskaitu skaicius
 */
    System.out.print("Kiek paskaitu yra pirmadieni? : ");
    Scanner sca = new Scanner(System.in);
    String a = sca.nextLine();
    System.out.print("Kiek paskaitu yra antradieni? : ");
    Scanner scb = new Scanner(System.in);
    String b = scb.nextLine();
    System.out.print("Kiek paskaitu yra treciadieni? : ");
    Scanner scc = new Scanner(System.in);
    String c = scc.nextLine();
    System.out.print("Kiek paskaitu yra ketvirtadieni? : ");
    Scanner scd = new Scanner(System.in);
    String d = scd.nextLine();
    System.out.print("Kiek paskaitu yra penktadieni? : ");
    Scanner sce = new Scanner(System.in);
    String e = sce.nextLine();
    System.out.print("Iveskite paskaitu trukme minutemis : ");
    Scanner scf = new Scanner(System.in);
    String f = scf.nextLine();
/*
Konvertuojame String tipo kintamuosius i int tipo
*/
    int pir = Integer.parseInt(a);
    int ant = Integer.parseInt(b);
    int tre = Integer.parseInt(c);
    int ketv = Integer.parseInt(d);
    int penkt = Integer.parseInt(e);
    int pamokuTrukme = Integer.parseInt(f);

    int sum = pir + ant + tre + ketv + penkt;  // Atliekame skaiciavimus
    int laikasMinut = sum * pamokuTrukme;      // Atliekame skaiciavimus

    System.out.println("Paskaitu skaicius per savaite = " + sum + ".");
    System.out.println("Tai sudaro = " + laikasMinut + " minuciu.");
}

}
