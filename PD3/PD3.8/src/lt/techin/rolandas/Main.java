package lt.techin.rolandas;

public class Main {

    public static void main(String[] args) {
// Pagal uzduoties salygas inicijuojame ir priskiriame kintamuosius
        double a = (7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5);
        double b = 12.78 / (15.4 - 2.75);
// Savikontrolei isvedame skaiciavimu reiksmes
        System.out.println("Kintamijo a reiksme = " + a + '\n' + "Kintamijo b reiksme = " + b);
// Atliekame logini a ir b reiksmiu palyginima
        System.out.println("Ar a ir b reiksmes lygios? - " + (a == b));
    }
}
