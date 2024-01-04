package lt.techin.rolandas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
/*
Ivedame duomenis
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite sveiku skaiciu seka, atskirdami reiksmas tarpais: ");
        String str = sc.nextLine();
        System.out.println("Jus ivedete: " + str);  // Ivedimo kontrole
/*
Daliname/splitiname gauta Stringa pagal nurodyta pozymi, formuojame reiksmiu masyva
 */
        String[] arrayString = str.split(" ");

        int suma = 0;
        for(int i = 0; i < arrayString.length; i++){  // Skaiciuojame masyvo reiksmiu suma
          suma += Integer.parseInt(arrayString[i]);
        }
/*
Spausdiname rezultata
 */
        System.out.println("Ivestu skaiciu suma = " + suma);
    }
}
