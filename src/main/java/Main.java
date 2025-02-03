import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount("90567843", 5500);

        BankAccount account = bank.getAccount("90567843");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.CANADA);


        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + currencyFormat.format(account.getInitialBalance()));

        account.deposit(450);
        account.withdrawal(900);

        System.out.println("Amount Deposited: " + currencyFormat.format(account.getLastDepositAmount()));
        System.out.println("Amount Withdrawn: " + currencyFormat.format(account.getLastWithdrawalAmount()));
        System.out.println("Current Balance: " + currencyFormat.format(account.getBalance()));



    }
}
