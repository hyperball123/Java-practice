package classesAndObjects;

public class BankMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123456789,"John Doe",1000.0);

        account1.deposit(500.0);
        account1.withdraw(200.0);

        double balance = account1.getBalance();
        System.out.println("Current balance: $" + balance);
    }
}
