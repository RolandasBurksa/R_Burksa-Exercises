public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();

//        Account marysAccount = new Account("12345678", 10000.0, "Mary Dairy", "marys@gmail.com", "+370-123-12345");

        Account marysAccount = new Account();

        bobsAccount.withdrawalFunds(100.0);
        bobsAccount.depositFunds(250.0);
        bobsAccount.withdrawalFunds(50.0);

        marysAccount.withdrawalFunds(150.0);
        marysAccount.depositFunds(350.0);
        marysAccount.withdrawalFunds(550.0);

        System.out.println(marysAccount.getNumber());
        System.out.println(marysAccount.getBalance());

        Account timsAccount = new Account("Tim", "tim@email.com", "123456");
        System.out.println("AccountNo: " + timsAccount.getNumber() + "; name - " + timsAccount.getCustomerName());


        Customer customer = new Customer();

        Customer customerBob = new Customer("Bob", 1000.00, "bob@email.com");

        System.out.println(customerBob.getName());
        System.out.println(customerBob.getCreditLimit());
        System.out.println(customerBob.getEmailAddress());

        Customer customerAda = new Customer();

        System.out.println(customerAda.getName());
        System.out.println(customerAda.getCreditLimit());
        System.out.println(customerAda.getEmailAddress());
    }
}
