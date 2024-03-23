package classesAndObjects;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber,String accountHolderName,double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        }else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}
