
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount myAccount = new BankAccount(1000, "Sally Jones"); //first parameter is original balance, second parameter is account owner name
        myAccount.deposit(505.22); //parameter is amount of money deposited
        myAccount.withdraw(100); //parameter is amount of money withdrawn
        System.out.println("The " + myAccount.getName() + " account balance is, $" + myAccount.getBalance());
    }
}