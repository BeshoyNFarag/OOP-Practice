/*
Write a Java program to create a class called "Bank" with a collection
of accounts and methods to add and remove accounts, and to deposit and withdraw money.
Also define a class called "Account" to maintain account details of a particular customer.
*/

import java.util.ArrayList;


public class Bank  {

    ArrayList<Account> bankAccounts = new ArrayList<>();
    Account acc = new Account();
    double balance = acc.getBalance();
    String name = acc.getName();
    String iban = acc.getIban();
    int age = acc.getAge();


    public void depositMoney( Account acc, double money ) {


        acc.deposit(money);

    }
    public void withdrawMoney( Account acc, double money ) {


        acc.withdraw(money);

    }


    public  void addAccount(Account account){
        bankAccounts.add(account);
    }
    public void removeAccount(Account account){
        bankAccounts.remove(account);
    }
    public void getAccounts (){
        bankAccounts.forEach(a -> System.out.printf("the age is %d of the %s account holder for %s of amount " +
                        "%.2f%n",
                a.getAge(), a.getName(),a.getIban(), a.getBalance()));}
}








