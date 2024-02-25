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

public class BankAccount {
    private  final String accountNumber;
    private final String  owner;
    private double balance;

    public BankAccount(String accountNumber, String owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }

    }
    public boolean withdraw(double amount){
        if (amount > 0 && balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }
//    public double exchange(double amount, Srring ??){
//
//    }


}
