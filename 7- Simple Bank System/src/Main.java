/*
Write a Java program to create a class called "Bank" with a collection
of accounts and methods to add and remove accounts, and to deposit and withdraw money.
Also define a class called "Account" to maintain account details of a particular customer.
*/


public class Main {
    public static void main(String[] args) {
        Account beshoy = new Account(30000, "Beshoy", "DE50", 22);
        Account nady = new Account(60000, "Nady", "DE60", 52);
        Account farag = new Account(1000, "Farag", "DE70", 82);
        Bank sparkasse = new Bank();

        sparkasse.addAccount(beshoy);
        sparkasse.addAccount(nady);
        sparkasse.addAccount(farag);
        sparkasse.getAccounts();
        sparkasse.withdrawMoney(beshoy, 10000);
        System.out.println();
        sparkasse.getAccounts();
        sparkasse.removeAccount(farag);
        System.out.println();
        sparkasse.getAccounts();

    }
}