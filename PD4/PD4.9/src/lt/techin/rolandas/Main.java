package lt.techin.rolandas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
Ivedame puodeliu skaiciu
 */
        System.out.print("Iveskite turima puodeliu skaiciu: ");
        Scanner sc = new Scanner(System.in);
        int puodSkaic = sc.nextInt();
/*
Atliekame skaiciavimus su ivestais ir turimais duomenimis ir isvedame rezultata.
 */
        System.out.println("Ivestas puodeliu skaicius: " + puodSkaic);
        System.out.println("Ivestas puodeliu skaicius bus supakuotas i -  " + (puodSkaic / 3) + " pilnas dezutes.");
        System.out.println("Nesupakuoti liks: " + (puodSkaic % 3) + " puodeliai.");
    }
}
