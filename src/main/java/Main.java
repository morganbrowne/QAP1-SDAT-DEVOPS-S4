public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount("90567843", 5500);

        BankAccount account = bank.getAccount("90567843");


        System.out.println(account.getAccountNumber());
        System.out.println(account.getInitialBalance());

        account.deposit(450);
        account.withdrawal(900);

        System.out.println("Amount Deposited: " + account.getLastDepositAmount());
        System.out.println("Amount Withdrawn: " + account.getLastWithdrawalAmount());
        System.out.println("Current Balance: " + account.getBalance());



    }
}
