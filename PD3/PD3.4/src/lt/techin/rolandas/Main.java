package lt.techin.rolandas;

public class Main {

    public static void main(String[] args) {
 /*
 Inicijuojame kintamuosius
  */
        int a = 1;
        int b = 2;
        int c = 4;
        int d = 5;
/*
Atliekame logines operacijas su inicijuotais kintamaisiais, rezultatus isvedame i ekrana
 */
        System.out.println("a=1, b=2, a > b = " + (a > b));
        System.out.println("c=4, d=5, d > c = " + (d > c));
        System.out.println("a=1, a == 1 = " + (a == 1));
        System.out.println("a=1, b=2, a == b = " + (a == b));
        System.out.println("c=4, d=5, c != d = " + (c != d));
        System.out.println("a=1, d=5, a >= d = " + (a >= d));
    }
}