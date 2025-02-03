/**
 * Testing File:
 * 1. Testing Account Creation - getAccountNumber & getBalance after creating account.
 * 2. Testing Duplicate Accounts -
 * 3. Testing Withdrawal Amount - Testing to produce the right balance after withdraw.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @Test
    void testAccountCreation() {
        BankAccount account = new BankAccount("BA1560987", 3500);
        assertEquals("BA1560987", account.getAccountNumber());
        assertEquals(3500, account.getBalance());
    }

    @Test
    void testDuplicateAccount() {
        Bank bank = new Bank();
        bank.createAccount("BA1560987", 3500);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bank.createAccount("BA1560987", 3500);
        });
        assertEquals("Account Already Exists.", exception.getMessage());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount("BA1560987", 3500);
        account.withdrawal(450);
        assertEquals(3050, account.getBalance(), 0.01);
    }
}
