package lt.techin.rolandas;

public class Main {

    public static void main(String[] args) {
/*
Isvedame informacija apie pradinius duomenis i ekrana
 */
        System.out.println("Tarkime turime sekancius bulio kintamuosius A ir B su reiksmemis: ");
        System.out.println("______________________________");
/*
Inicijuojame bulio kuntamuosius, priskiriame jiems reiksmes
 */
        boolean A = true;
        boolean B = false;
/*
Isvedame pasirinktas kintamuju reiksmes i ekrana,
 panaudojame logini operatoriu, isvedame rezultatus
 */
        System.out.println("boolean A = true");
        System.out.println("boolean B = false");
        System.out.println("Tada, A || B bus lygu - " + (A || B));
        System.out.println("Tada, A && B bus lygu - " + (A && B));
        System.out.println("______________________________");
/*
Inicijuojame bulio kuntamuosius, priskiriame jiems reiksmes
 */
        boolean A1 = true;
        boolean B1 = true;
 /*
Isvedame pasirinktas kintamuju reiksmes i ekrana,
 panaudojame logini operatoriu, isvedame rezultatus
 */
        System.out.println("boolean A1 = true");
        System.out.println("boolean B1 = true");
        System.out.println("Tada, A1 || B1 bus lygu - " + (A1 || B1));
        System.out.println("Tada, A1 && B1 bus lygu - " + (A1 && B1));
        System.out.println("______________________________");
/*
Inicijuojame bulio kuntamuosius, priskiriame jiems reiksmes
 */
        boolean A2 = false;
        boolean B2 = false;
/*
Isvedame pasirinktas kintamuju reiksmes i ekrana,
 panaudojame logini operatoriu, isvedame rezultatus
 */
        System.out.println("boolean A2 = false");
        System.out.println("boolean B2 = false");
        System.out.println("Tada, A2 || B2 bus lygu - " + (A2 || B2));
        System.out.println("Tada, A2 && B2 bus lygu - " + (A2 && B2));
    }
}
