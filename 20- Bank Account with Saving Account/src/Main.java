/*
Write a Java program to create a class called "BankAccount" with attributes for account number,
account holder's name, and balance. Include methods for depositing and withdrawing money,
as well as checking the balance. Create a subclass called "SavingsAccount" that adds an interest
rate attribute and a method to apply interest.
*/

public class Main {
    public static void main(String[] args) {

        SavingsAccount acc1 = new SavingsAccount("Beshoy Farag", 35000, 241241,12.5);
        System.out.println(acc1.balance);
        acc1.deposit(2000);
        System.out.println(acc1.balance);
        acc1.withdraw(1000);
        System.out.println(acc1.balance);
        acc1.applyInterest();

        System.out.println();


        BankAccount acc2 = new BankAccount("Nady Gerges", 40000, 12432);
        System.out.println(acc2.balance);
        acc2.deposit(2000);
        System.out.println(acc2.balance);
        acc2.withdraw(1000);
        System.out.println(acc2.balance);

    }
}