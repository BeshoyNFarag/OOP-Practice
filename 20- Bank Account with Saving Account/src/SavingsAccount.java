/*
Write a Java program to create a class called "BankAccount" with attributes for account number,
account holder's name, and balance. Include methods for depositing and withdrawing money,
as well as checking the balance. Create a subclass called "SavingsAccount" that adds an interest
rate attribute and a method to apply interest.
*/


public class SavingsAccount extends BankAccount{
    private double interestRate;


    public SavingsAccount(String holderName, double balance, long accountNumber, double interestRate) {
        super(holderName, balance, accountNumber);
        this.interestRate = interestRate;


    }
    public void applyInterest() {
        balance  = balance + (interestRate/100) * (balance);
        System.out.println(balance);
    }



}
