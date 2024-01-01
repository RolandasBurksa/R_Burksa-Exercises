package lt.techin.rolandas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
Ivedame automobilio greiti
 */
        System.out.print("Iveskite automobilio greiti km/h: ");
        Scanner sc = new Scanner(System.in);
        float autoGreitis = sc.nextFloat();
/*
Atliekame skaiciavimus su ivestais ir turimais duomenimis ir isvedame rezultata.
 */
        System.out.println("Ivestas automobilio greitis km/h: " + autoGreitis);
        System.out.println("Automobilis pravaziuos tuneli per: " + (float)((0.264/(autoGreitis)) * 3600) + " s.");
    }
}
