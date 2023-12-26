
package lt.techin.rolandas;
// Sukuriame klase Main
public class Main {
    // Sukuriame klases Main metoda
    public static void main(String[] args) {
        /*
        Deklaruojame primityvaus tipo kintamuosius ir priskiriame
           jiems reiksmes
         */
        byte myByte =  111;
        short myShort = 1;
        int myInt = 10;
        long myLong = 15L;
        float myFloat = 20.22f;
        double myDouble = 30.123123;
        boolean myBoolean = true;
        char myChar = 'A';
/*
Spausdiname priskirtas kintamuju reiksmes ekrane
 */
        System.out.println("Byte - "+myByte);
        System.out.println("Short - "+myShort);
        System.out.println("Int - "+myInt);
        System.out.println("Long - "+myLong);
        System.out.println("Float - "+myFloat);
        System.out.println("Double - "+myDouble);
        System.out.println("Boolean - "+myBoolean);
        System.out.println("Char - "+myChar);
    }
}