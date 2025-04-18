/*
Write a Java program to create a class called "BankAccount" with attributes for account number,
account holder's name, and balance. Include methods for depositing and withdrawing money,
as well as checking the balance. Create a subclass called "SavingsAccount" that adds an interest
rate attribute and a method to apply interest.
*/



public class BankAccount {

    protected String holderName;
    protected double balance;
    protected long accountNumber;

    public BankAccount(String holderName, double balance, long accountNumber) {
        this.holderName = holderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("insufficient balance");
        }
        else {
            balance -= amount;
        }
    }
    public void getBalance(){
        System.out.println("Balance: " + balance);
    }
}
