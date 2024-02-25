/**
 * Realizuokite parduotuvės funkcionalumą. Parduotuvė parduoda prekes: maisto prekes, alkoholi-
 * nius gėrimus, knygas ir laikraščius. Bet kokios parduodamos prekės savybė:
 * - Pavadinimas
 * - Kaina
 * Prekė žino savo kaina ir kainą su PVM. Apie PVM tarifus galite paskaityti čia: ”Pridėtinės
 * vertės mokestis”. Klientai gali apsipirkti parduotuvėje ir nupirkti bet kokias ir bet kiek prekių.
 * Apmokant prekių krepšelį klientui turi būti nurodoma bendra prekių kaina,
 * kaina su PVM ir kaina doleriais pagal galiojanti šiai dienai Eur / USD keitimo kursą.
 * Taip pat parduotuvėje gali vykti įvairios akcijos, tad klientui turi būti pritaikomos nuolaidos
 * jei tokios priklauso.
 */

package lt.techin.rolandas;

import lt.techin.rolandas.controlles.ShoppingCart;
import lt.techin.rolandas.products_groups.Alcohol;
import lt.techin.rolandas.products_groups.Food;
import lt.techin.rolandas.products_groups.Medicine;

public class Main_PD9_2 {
    public static void main(String[] args) {
        Food bread = new Food("Vilniaus duona", 1, 0);
        Medicine panadol = new Medicine("Panadol", 2.50, 0);
        Alcohol likeris = new Alcohol("Bosca", 15.0, 0);

        ShoppingCart myShopingCart = new ShoppingCart();
        myShopingCart.addItem(bread);
        myShopingCart.addItem(panadol);
        myShopingCart.addItem(likeris);


        System.out.println(myShopingCart.getTotalPrice() + " EUR");
        System.out.println(myShopingCart.getTotalPriceWithVat() + " EUR + VAT");
        System.out.println(myShopingCart.getPriceInUSD(1.0877) + " USD");

    }

}
