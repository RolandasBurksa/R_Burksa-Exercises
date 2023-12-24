package lt.techin.rolandas;
/* Importuojama klase Scanner tam kad
butu galima ivesti duomenis is
ivedimo irenginio, siuo atveju klaviaturos
 */
import java.util.Scanner;

public class Main {      // Sukuriama klase Main

    public static void main(String[] args) {    // Sukuriamas klases Main metodas

        Scanner sc = new Scanner(System.in);   // Inicijuojamas skaneris kuris yra naujas Skaneris ir zymimas sc
/* Ekrane(informacijos isvedimo irenginyje) spausdiname teksta */
        System.out.print("Iveskite savo varda: ");
/* Priskirame vartotojo ivesta teksta stringui - userName */
        String userName = sc.nextLine();
/* Isvedame vartotojo ivesta teksta pridedami reikiamus simbolius ir tarpus */
        System.out.print("Sveiki, "+ userName +"!");
    }
}
