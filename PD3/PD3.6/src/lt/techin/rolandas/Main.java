package lt.techin.rolandas;

public class Main {

    public static void main(String[] args) {
/*
Inicijuojame kintamuosius
 */
        int i = 10;
        char d = 'A';
/*
Kuriame Wrapper klases
 */
        Integer i1 = new Integer(i);
        Character d1 = new Character(d);
/*
Isvedame turini i ekrana
 */
        System.out.println("Boxing of integer, value: " + i1);
        System.out.println("Boxing of char, value: " + d1);
/*
Is Wrapper klases konvertuojame atgal i int ir char duomenu tipus
 */
        int i2 = i1.intValue();
        char d2 = d1.charValue();
/*
Isvedame turini i ekrana
 */
        System.out.println("Unboxing of integer, value: " + i2);
        System.out.println("Unboxing of char, value: " + d2);

    }
}
