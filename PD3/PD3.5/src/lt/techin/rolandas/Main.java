package lt.techin.rolandas;

public class Main {

    public static void main(String[] args) {
/*
Inicijuojame kintamuosius, konvertuojame is byte i int, atliekame veiksmus
 */
        byte by1 = 122, by2 = 74;
        int n1 = by1;
        int n2 = by2;
        int intSum1 = n1 + n2;
/*
Gautus rezultatus isvedame i ekrana
 */
        System.out.println("Suma paskaiciuota be duomenu konvertavimo, kintamieji byte tipo = " + (by1 + by2));
        System.out.println("Suma paskaiciuota atlikus duomenu konvertavima is byte i int = " + intSum1);

        byte by3 = 122, by4 = 104;
        int i =  by3 + by4;
        System.out.println("Suma paskaiciuota atlikus duomenu konvertavima is byte i int = " + i);
/*
Inicijuojame kintamuosius, konvertuojame is int i double, atliekame veiksmus
 */
        int int1 = 1231231231;
        int int2 = 1987987987;
        double int3 = int1;
        double int4 = int2;
        int intSum2 = int1 + int2;
        double id = int3 + int4;
/*
Gautus rezultatus isvedame i ekrana
 */
        System.out.println("Suma paskaiciuota be duomenu konvertavimo, kintamieji int tipo = " + intSum2);
        System.out.println("Suma paskaiciuota atlikus duomenu konvertavima is int i double = " + id);
    }
}
