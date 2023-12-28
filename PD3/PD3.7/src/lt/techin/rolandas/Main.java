package lt.techin.rolandas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*
Stringu palyginimai
 */
    String str1 = "abc";
    String str2 = "abc";
        System.out.print("Palyginimas ar str1 == str2 : ");
        System.out.println(str1 == str2);

    String str3 = new String("abc");
    String str4 = new String("abc");
        System.out.print("Palyginimas ar str3 == str4 : ");
        System.out.println(str3 == str4);
        System.out.print("Ar str3 lygus(equals)  str4 : ");
        System.out.println(str3.equals(str4));
/*
Stringu metodai
 */
    String str5 = "Braske, Aviete, Melyne, Brukne";
        System.out.println("Stringas yra: " + str5);
        int leng = str5.length();
        System.out.println("Stringo ilgis : " + leng + " poziciju.");
        System.out.println("Stringo 0 reiksme : " + str5.charAt(0) + ", stringo paskutine reiksme(-1) : " + str5.charAt(leng-1)+".");
        System.out.println("Stringo(String) keitimas i didziasias raides : " + str1.toUpperCase());
        System.out.println("Stringo(new String) keitimas i didziasias raides : " + str5.toUpperCase());
        System.out.println("Stringe yra simboliu seka 'Melyne' : " + str5.contains("Melyne"));
        String str5sub1 = str5.substring(8);
        System.out.println("Stringo str5 substringas pasideda nuo 8 simbolio : " + str5sub1);
        String str5sub2 = str5.substring(8, 23);
        System.out.println("Stringo str5 substringas pasideda nuo 8 simbolio ir baigiasi 23 : " + str5sub2);
        String str6 = str5.replace("e", "iu");
        System.out.println("Stringo str5 simboliu 'e' keitimas i 'iu' : " + str6);
/*
Sting tipo kintamojo keitimas i masyva String --> Array
 */
        char[] chArr = str5.toCharArray();
        System.out.println("Stringo str5 keitimas i masyva chArr : " + Arrays.toString(chArr));

        char[] chArr1 = str5.toCharArray();
        for(char ch : chArr1) {
            System.out.println("Stringo str5 keitimas i masyva chArr : " + ch);
        }
        String[] strArr2 = str5.split(",");
        for(String s : strArr2) {
            System.out.println("Stringo str5 keitimas i masyva chArr : " + s);
        }
    }
}
