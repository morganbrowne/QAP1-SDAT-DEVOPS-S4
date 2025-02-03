/**
 * Bank Class:
 * Used to create an Account.
 */

import java.util.Map;
import java.util.HashMap;
public class Bank {
    private Map<String, BankAccount> accounts = new HashMap<>();

    public void createAccount(String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, new BankAccount(accountNumber, initialBalance));
        } else {
            throw new IllegalArgumentException("Account Already Made.");
        }

    }


    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

}
