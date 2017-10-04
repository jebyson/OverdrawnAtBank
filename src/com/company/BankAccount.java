package com.company;

import jdk.nashorn.internal.ir.BaseNode;

/**
 * Created by je565 on 10/4/17.
 */

public class BankAccount {

    public double balance; //total amount of money in account
    public String name; //name of account owner

    public BankAccount(double a, String b)
    {
        balance = a;
        name = b;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
    }

    public void deposit(double x)
    {
        balance = balance + x;
    }
    public void withdraw(double y)
    {
        balance = balance - y;
    }
}