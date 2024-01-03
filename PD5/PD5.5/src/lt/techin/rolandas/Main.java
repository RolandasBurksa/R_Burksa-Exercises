package lt.techin.rolandas;

public class Main {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {                    // Formuojama isvedimo cikla
            if (i % 5 != 0)                             // Tikriname ar skaicius dalosi is 5
                System.out.println("Isvedame : " + i);  // Isvedame skaicius kurie nesidalina is 5
            if (i % 88 == 0) {                          // Tikriname ar skaiciai dalinasi is 88
                break;                                  // Jeigu dalinasi, stabdome skaiciavima/isvedima
            }
        }
    }
}