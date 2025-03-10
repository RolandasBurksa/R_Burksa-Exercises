package lt.techin;

import javax.swing.plaf.PanelUI;

import static junit.framework.TestCase.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Alius", "Valius", 1000.0, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw() throws Exception{
        fail("This test has yot to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        BankAccount account = new BankAccount("Alius", "Valius", 1000.0, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.0, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        BankAccount account = new BankAccount("Alius", "Valius", 1000.0, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.0, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Alius", "Valius", 1000.0, BankAccount.CHECKING);
        assertTrue("The account is not checking account!",account.isChecking());
    }


}