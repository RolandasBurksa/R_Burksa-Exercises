package lt.techin.rolandas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp(){

        bankAccount = new BankAccount("LT123456", "Rolandas");

    }

    @Test
    public void shouldBalanceIsCorrectTheBankAccountIsCreated(){
        // given
        // when
        // then
        assertEquals(0.0, bankAccount.getBalance());
    }

    @Test
    public void shouldBalanceIsCorrectAfterAddDeposit(){
        // given
        // when
        bankAccount.deposit(100);
        // then
        assertEquals(100.0, bankAccount.getBalance());
    }
    @Test
    public void  shouldAccountOwnerNameReturnCorrectValue(){
        // given
        // when
        // then
        assertEquals("Rolandas", bankAccount.getAccountOwner());
    }
    @Test
    public void shouldWithdrawAmountExceedingBalanceReturningFalse(){
        bankAccount.deposit(100);
        assertFalse(bankAccount.withdraw(200));
    }

    @Test
    public void shouldWithdrawValidAmountWhenDecreaseBalance(){
        bankAccount.deposit(1000);
        assertAll(
                () -> assertTrue(bankAccount.withdraw(500)),
                            () -> assertEquals(500, bankAccount.getBalance())
        );
    }

    @Test
    public void shouldAccountOwnerNameThrowNewIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount("LT123489", " ");
        });
    }

    @Test
    public void shouldDepositNegativeValueIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> {
             bankAccount.deposit(-100);
        });
    }

}
