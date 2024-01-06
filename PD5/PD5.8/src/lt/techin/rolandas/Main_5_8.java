package lt.techin.rolandas;

import java.util.Scanner;

public class Main_5_8 {
/*
Inicijuojame kintamuosius, ivedame pradinius duomenis,
 */
    public static void main(String[] args) {
        System.out.print("Iveskite kuro bako talpa, litrais: ");
        Scanner sc = new Scanner(System.in);
        int talpaBako = sc.nextInt();
        System.out.print("Iveskite kuro sanaudas, litrais: ");
        Scanner sc1 = new Scanner(System.in);
        int lyginesSanaudos = sc1.nextInt();
        int nelyginesSanaudos = 2 * lyginesSanaudos;
        int einamojiDienaSan = nelyginesSanaudos;
        int nuvaziuotosDienos = 0;
        int bakoLikutis = talpaBako;
/*
Inicijuojame kuro likucio nustatymo cikla
 */
        while (bakoLikutis > einamojiDienaSan) {
            bakoLikutis = bakoLikutis - einamojiDienaSan;
            nuvaziuotosDienos++;
/*
Rotuojame keliones dienas is nelyginiu i lygines
 */
            if (einamojiDienaSan == nelyginesSanaudos){
                einamojiDienaSan = lyginesSanaudos;
                System.out.print("|__");
            } else {
                einamojiDienaSan = nelyginesSanaudos;
                System.out.print("|_");
            }
        }
        if (bakoLikutis > 0) {nuvaziuotosDienos++;  // Tikriname ar dar bake liko kuro po while ciklo, pridedame kiek liko
            System.out.println("|_");
        }

        System.out.println("Bako talpa = " +talpaBako + ", kuro sanaudos = " + lyginesSanaudos + ", kelione truks = " + nuvaziuotosDienos + " dienas.");
    }
}
