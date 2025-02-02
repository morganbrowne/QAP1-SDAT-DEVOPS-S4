public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount("90567843", 5500);

        BankAccount account = bank.getAccount("90567843");
        account.deposit(450);
        account.withdrawal(900);

        System.out.println("Amount Deposited: " + account.getDepositAmount() + "");
    }
}
