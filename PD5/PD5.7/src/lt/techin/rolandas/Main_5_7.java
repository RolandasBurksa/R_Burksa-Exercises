package lt.techin.rolandas;

import java.util.Scanner;

public class Main_5_7 {
/*
Aprasome kintamuosius, ivedame pirma reiksme
 */
    public static void main(String[] args) {
        System.out.print("Iveskite varzybose dalyvaujanciu begiku skaiciu : ");
        Scanner sc = new Scanner(System.in);
        int ivestasBegikiuSkaicius = sc.nextInt();
        int sum = 0;
        int min = -1;
/*
Formuojame duomenu ivedimo cikla, skaiciuojame sumini laika
 */
        for (int begikuSkaiciusPrad = 1; begikuSkaiciusPrad <= ivestasBegikiuSkaicius; begikuSkaiciusPrad++) {
            System.out.print("Iveskite begiko laika sekundemis : ");
            Scanner sc1 = new Scanner(System.in);
            int laikasSekundemis = sc1.nextInt();
            sum = sum + laikasSekundemis;
/*
Is ivedamu laiku renkame min laika
 */
            if (laikasSekundemis < min || min == -1) {
                min = laikasSekundemis;
            }

            }
/*
Skaiciuojame vidutini laika, isvedame rezultatus
 */
            int vid = sum / ivestasBegikiuSkaicius;
            System.out.println("Viso dalyvavo: " + ivestasBegikiuSkaicius + " begikai, laiko vidurkis: " + vid + " s, maziausias laikas = " + min + " s.");
            System.out.println("Geriausias begikas atbego " + (vid - min) + " s greiciau nei vidutinis laikas.");

        }
    }
