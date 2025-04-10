/*
Write a Java program to create a class called "Bank" with a collection
of accounts and methods to add and remove accounts, and to deposit and withdraw money.
Also define a class called "Account" to maintain account details of a particular customer.
*/


public class Account {
    private double balance;
    private String name;
    private String iban;
    private int age;


    public Account() {}
    public Account(double balance, String name, String iban, int age){
        this.name = name;
        this.balance = balance;
        this.iban = iban;
        this.age = age;


    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }

    }

    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getIban(){
        return iban;
    }



}
