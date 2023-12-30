package lt.techin.rolandas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
Ivedame pirmaji skaiciu
 */
        System.out.print("Iveskite sveikaji skaiciu a: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
/*
Ivedame antraji skaiciu
 */
        System.out.print("Iveskite sveikaji skaiciu b: ");
        Scanner sc1 = new Scanner(System.in);
        String b = sc1.nextLine();
        System.out.println("Jus ivedete a = "+ a + ", b =" + b); // Isvedame skaicius savikontrolei
/*
Konvertuojama String tipo kintamuosius i double tipo
 */
        double c = Integer.parseInt(a);
        double d = Integer.parseInt(b);
/*
Atliekame artimetinius veiksmus, isvedame rezultatus i ekrana
 */
        System.out.println("Suma: a + b = " + (c + d));
        System.out.println("Skirtumas: a - b = " + (c - d));
        System.out.println("Daugyba: a * b = " + (c * d));
        System.out.println("Dalyba: a / b = " + (c / d));
        System.out.println("Dalyba su liekana: a % b = " + (c % d));
        System.out.println("Padidiname a++ reiksme vienu vienetu: a = " + (++c));
        System.out.println("Pamaziname b-- reiksme vienu vienetu: a = " + (--d));
    }
}
