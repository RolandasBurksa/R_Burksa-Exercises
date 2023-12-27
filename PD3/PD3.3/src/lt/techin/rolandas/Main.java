package lt.techin.rolandas;

public class Main {

    public static void main(String[] args) {
/*
Deklaruojame float tipo kintamuosius, priskiriame jiems reiksmes ir atliekame sudeti
 */
        float myFloat1 = 1.2f;
        float myFloat2 = 2.4f;
        float resultf = myFloat1 + myFloat2;
/*
Deklaruojame double tipo kintamuosius, priskiriame jiems reiksmes ir atliekame sudeti
 */
        double myDouble1 = 1.2;
        double myDouble2 = 2.4;
        double resultd = myDouble1 + myDouble2;
/*
Isvedame kintamuju reiksmes ir sudeties rezultatus i ekrana
 */
        System.out.println("DoubleMax = " + Double.MAX_VALUE);
        System.out.println("DoubleMin = " + Double.MIN_VALUE);
        System.out.println("FloatMax = " + Float.MAX_VALUE);
        System.out.println("FloatMin = " + Float.MIN_VALUE);
        System.out.println("Float = " + myFloat1);
        System.out.println("Float = " + myFloat2);
        System.out.println("Float_sum_resultf = " + resultf);
        System.out.println("Double = " + myDouble1);
        System.out.println("Double = " + myDouble2);
        System.out.println("Double_sum_resultd = " + resultd);
    }
}