/**
 * Bank Account class:
 * This class is used to set up Deposits and Withdrawals to the Bank Account.
 */

public class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // Method for depositing.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be greater than 0. ");
        }
    }

    // Method to Withdrawal.
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Withdrawal amount cannot exceed balance. ");
        }
    }

    // get Method for Balance and Account Number.
    public double getBalance() {
        return balance;
    }
    public String  getAccountNumber() {
        return accountNumber;
    }

//    public double getDepositAmount(double amount) {
//        return amount;
//    }


}
