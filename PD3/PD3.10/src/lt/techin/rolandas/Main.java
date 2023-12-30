package lt.techin.rolandas;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite sveiku skaiciu seka, atskirdami reiksmas tarpais: ");
        String str = sc.nextLine();

//        int i = scan.nextInt();

        String[] arrayString = str.split(" ");

//        int[] myStringArr = new int[arrayString.length];

       int a = Integer.parseInt(str);

        System.out.println("Jus ivedete : " + str + " a = " + a);
//        System.out.println("Jus ivedete : " + i);
//        System.out.println("Jus ivedete : " + myStringArr);




    }

}
