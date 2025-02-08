package lt.techin;

class AccountDetails {

    private String userName = "UserName";
    private String password = "password";
    private double balance = 1000.0;

//        public AccountDetails(String userName, String password) {
//        this.userName = userName;
//        this.password = password;
//    }

    public double getWalletBalance(String userName, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)) {
            return balance;
        } else {
            return 0.0;
        }
    }
}
public class BankAccount {

    public static void main(String[] args) {

        AccountDetails accountDetails = new AccountDetails();
        System.out.println(accountDetails.getWalletBalance("UserName", "password"));
    }
}

