package lt.techin.rolandas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Inicijuojame kintamuosius
 */
        double plytIlgis, plytAukst;
        plytIlgis = 0.2;
        plytAukst = 0.1;
/*
Ivedame ir priskiriame kintamuosius is klaviaturos
 */
        System.out.print("Iveskite sienos ilgi a sveika skaiciu, metrais : ");
        Scanner sca = new Scanner(System.in);
        double sienAukst = sca.nextDouble();
        System.out.print("Iveskite sienos auksti h sveika skaiciu, metrais : ");
        Scanner scah = new Scanner(System.in);
        double sienIlgis = scah.nextDouble();
        System.out.print("Iveskite vienos plytos kaina k Eurais : ");
        Scanner scak = new Scanner(System.in);
        double k = scak.nextDouble();

        float floatKaina = (float)(((sienIlgis * sienAukst) / (plytIlgis * plytAukst)) * k);  // Skaiciuojame, kiek kainuos plytos
/*
Atliekame skaiciavimus ir isvedame rezultatus
 */
        System.out.println("______________________________");
        System.out.println("Reika pastatyti: " + (sienIlgis * sienAukst) + " kv.metru ploto siena.");
        System.out.println("Vienos plytos plotas: " + (plytIlgis * plytAukst) + " sudaro kv.metru.");
        System.out.println("Sienai pastatyti viso reikes: " + (float)((sienIlgis * sienAukst) / (plytIlgis * plytAukst)) + " vienetu plytu.");
/*
Isvedame plytu kaina uzduotu formatu
 */
        System.out.print("Sienai pastatyti plytos kainuos: ");
        System.out.print(String.format("%.2f" , floatKaina));
        System.out.print(" Euru.");
    }
}
