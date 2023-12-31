package lt.techin.rolandas;

public class Main {

    public static void main(String[] args) {
/*
Inicijuojame kintamuosius
 */
        double a, b, c, d, f, res, res1, res2, res3, res4, res5, res6, res31;
        a = 2;
        b = 4;
        c = 3;
        d = 6;
        f = 10;
/*
Aprasome aritmetinius veiksmus su kintamaisiais, naudodami veiksmu eiliskumo taisykles
 */
        res  = a + b + c + d + f;
        res1 = a - b - c - d - f;
        res2 = a * b * c * d * f;
        res3 = a - b * c + d / f;
        res31 = a - (b * c) + (d / f);
        res4 = (a - b) * (c + d) / f;
        res5 = ((a - b) * c )+ d / f;
        res6 = (a - b * c + d) / f;
/*
Isvedame gautus rezultatus
 */
        System.out.println("Turime kintamuosius: a = 2, b = 4, c = 3, d = 6, f = 10.");
        System.out.println("Atlike veiksmu seka: a + b + c + d + f, gauname rezultata: " + res);
        System.out.println("Atlike veiksmu seka: a - b - c - d - f, gauname rezultata: " + res1);
        System.out.println("Atlike veiksmu seka: a * b * c * d * f, gauname rezultata: " + res2);
        System.out.println("Atlike veiksmu seka: a - b * c + d / f, gauname rezultata res1 " + res3);
        System.out.println("Atlike veiksmu seka: a - (b * c) + (d / f), gauname rezultata res2 " + res31);
        System.out.println("Atlike veiksmu seka ir sulygine res1 == res2 gauname kad: " + (res3 == res31));
        System.out.println("Atlike veiksmu seka: (a - b) * (c + d) / f, gauname rezultata: " + res4);
        System.out.println("Atlike veiksmu seka: ((a - b) * c )+ d / f, gauname rezultata: " + res5);
        System.out.println("Atlike veiksmu seka: (a - b * c + d) / f, gauname rezultata: " + res6);
    }
}
