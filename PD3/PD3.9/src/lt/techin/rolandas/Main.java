package lt.techin.rolandas;

public class Main {

    public static void main(String[] args) {

        int i = 10;            // Sukuriame kintamaji, priskiriame reiksme
        Integer b_object = i;  // Autoboxing, primityvu kintamaji konvertuojame i objekta su primityviojo reiksme

        System.out.println("i = " + i +'\n' + "b_object = " + b_object);  // Isvedame abi reiksmes

        Integer k_object = new Integer(20);  // Sukuriame objekta Integer su reiksme
        int l = k_object;  // Unboxing, objekta Integer konvertuojame i primityvu kintamaji su reiksme

        System.out.println("k_object = " + k_object +'\n' + "l = " + k_object);  // Isvedame abi reiksmes
    }
}
