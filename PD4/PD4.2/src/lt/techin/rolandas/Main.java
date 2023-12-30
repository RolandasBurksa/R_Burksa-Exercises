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
        System.out.println("____________________");
/*
Konvertuojama String tipo kintamuosius i int tipo
 */
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
// Atliekame ivestu skaiciu palyginima, isvedame rezultatus i ekrana
        System.out.println("Ar a == b " + (c == d));
        System.out.println("Ar a != b " + (c != d));
        System.out.println("Ar a > b " + (c > d));
        System.out.println("Ar a < b " + (c < d));
        System.out.println("Ar a >= b " + (c >= d));
        System.out.println("Ar a <= b " + (c <= d));
        System.out.println("____________________");
/*
Tie patys veiksmai parodant ivestus kaicius
 */
        System.out.println("Ar " + c + " == " + d + " - " + (c == d));
        System.out.println("Ar " + c + " != " + d + " - " + (c != d));
        System.out.println("Ar " + c + " > " + d + " - " + (c > d));
        System.out.println("Ar " + c + " < " + d + " - " + (c < d));
        System.out.println("Ar " + c + " >= " + d + " - " + (c >= d));
        System.out.println("Ar " + c + " <= " + d + " - " + (c <= d));
    }
}
