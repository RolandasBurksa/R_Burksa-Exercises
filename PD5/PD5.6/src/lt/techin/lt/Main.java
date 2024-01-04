package lt.techin.lt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Isvedame pradine salyga, inicijuojame kintamuosius
 */
        System.out.println("Iveskite atveztu egluciu skaiciu : ");
        Scanner sc = new Scanner(System.in);
        int eglSkaiciusAtv = sc.nextInt();
        int eglSkaiciusPrad;
        float sum = 0f;
/*
Formuojame for ciklo salyga
 */
        for (eglSkaiciusPrad = 1; eglSkaiciusPrad <= eglSkaiciusAtv; eglSkaiciusPrad++) {
            System.out.print("Iveskite eglutes auksti cm : ");
            Scanner sc1 = new Scanner(System.in);
            float eglAukstis = sc1.nextFloat();
            sum = sum + eglAukstis;        // Sumuojame ivestus aukscius
        }
            float vid = sum / eglSkaiciusAtv;    // Skaiciuojame ivestu skaiciu vidurki
/*
Isvedame gautus rezultatus
 */
            System.out.println("Viso atvezta: " + eglSkaiciusAtv + " eglutes, kuriu aukscio vidurkis = "+ vid +" cm.");
    }
}
