/**
 * Bank Account class:
 * This class is used to set up Deposits and Withdrawals to the Bank Account.
 */

public class BankAccount {
    private String accountNumber;
    private int balance;
    private int initialBalance;
    private double lastDepositAmount = 0;
    private double lastWithdrawalAmount = 0;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // Method for depositing.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            lastDepositAmount = amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be greater than 0. ");
        }
    }

    // Method to Withdrawal.
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            lastWithdrawalAmount = 0;
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

    // get method for last deposit and withdrawal accounts.
    public double getLastDepositAmount() {
        return lastDepositAmount;
    }
    public double getLastWithdrawalAmount() {
        return  lastWithdrawalAmount;
    }

    public int getInitialBalance() {
        return initialBalance;
    }



}
