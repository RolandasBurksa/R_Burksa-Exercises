package lt.techin.rolandas;

public class Main {
    public static void main(String[] args) {
/*
Braizome trikampi
 */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++ ) {
                if (j == 1 || j == i || i ==5) {
                    System.out.print("* ");}
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("__________________________");
/*
Braizome staciakampi
 */
        for (int ste = 1; ste <= 5; ste++) {
            for (int stst = 1; stst <= 8; stst++) {
                if (stst == 1 || stst == 8 ||  ste == 1 || ste == 5) {
                    System.out.print("* ");}
                else  {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("__________________________");
/*
Braizome kvadrata
 */
        for (int stek = 1; stek <= 5; stek++) {
            for (int ststk = 1; ststk <= 5; ststk++) {
                if (ststk == 1 || ststk == 5 ||  stek == 1 || stek == 5) {
                    System.out.print("* ");}
                else  {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
