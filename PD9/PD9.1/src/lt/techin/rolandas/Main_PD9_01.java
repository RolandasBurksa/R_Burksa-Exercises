/**
 * Sukurkite klasę / objektą kuris realizuoja banko sąskaitos modelį su savybėmis:
 *  * Numeris
 *  * Savininkas
 *  * Balansas
 * Banko sąskaita leidžia įnešti ir nuimti pinigus. Sąskaitos numeris ir savininkas turi būti nekeičiami / unikalūs,
 * bet turi būti įmanoma juos sužinoti. Iš sąskaitos turi būti negalima išimti daugiau pinigų nei joje yra įdėta
 * (turi būti būdas sužinoti ar išėmimo operacija pavyko ar ne).
 *
 */

package lt.techin.rolandas;

public class Main_PD9_01 {
    public static void main(String[] args) {


        BankAccount myAccount = new BankAccount("LT123456", "Vaclav");
        System.out.println(myAccount.getBalance());
        myAccount.deposit(500);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(256);
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.withdraw(500));

    }

}
