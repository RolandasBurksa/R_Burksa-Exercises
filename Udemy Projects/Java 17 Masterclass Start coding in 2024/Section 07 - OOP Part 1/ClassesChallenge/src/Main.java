public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();

        Account marysAccount = new Account("12345678", 10000.0, "Mary Dary", "marys@gmail.com", "+370-123-12345");

        bobsAccount.withdrawalFunds(100.0);
        bobsAccount.depositFunds(250.0);
        bobsAccount.withdrawalFunds(50.0);

        marysAccount.withdrawalFunds(150.0);
        marysAccount.depositFunds(350.0);
        marysAccount.withdrawalFunds(550.0);

        System.out.println(marysAccount.getNumber());
        System.out.println(marysAccount.getBalance());

    }
}
