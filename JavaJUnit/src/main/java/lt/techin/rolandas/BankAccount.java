package lt.techin.rolandas;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private  String accountOwner;

    public BankAccount(String accountNumber, String accountOwner) {
        setAccountNumber(accountNumber);
        setAccountOwner(accountOwner);
        this.balance = 0.0;
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public boolean withdraw(double amount){
        if (amount > 0 && balance >= amount ){
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountNumber(String accountNumber) throws IllegalArgumentException{
        if (accountNumber != null && !accountNumber.trim().isEmpty()){
            this.accountNumber = accountNumber;
        } else {
            throw new IllegalArgumentException("Invalid account number");
        }
    }

    public void setAccountOwner(String accountOwner) throws IllegalArgumentException{
        if (accountOwner != null && !accountOwner.trim().isEmpty()){
            this. accountOwner = accountOwner;
        } else {
            throw new IllegalArgumentException("Invalid account owner name!");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountOwner='" + accountOwner + '\'' +
                '}';
    }
}
