/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

import sit.int675.week4.BankAccountException;

/**
 *
 * @author Student Lab
 */
public class BankAccount {

    private int accountId;
    private String name;
    private double balance;
    
    public BankAccount() {

    }
    
    public BankAccount(int accountId, String name) {
        this.accountId = accountId;
        this.name = name;
    }

    public BankAccount(int accountId, String name, double balance) throws BankAccountException {
        this.accountId = accountId;
        this.name = name;
        deposit(balance);
    }
    
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws BankAccountException {
        if (amount < 0) {
            throw new BankAccountException("Deposit with negative amount !!!");
        } else {
            setBalance(balance + amount);
        }
    }

    public void withdraw(double amount) throws BankAccountException {
        if (balance <= amount) {
            //System.out.println("Balance not enought !!!");
            throw new BankAccountException("Balance no enought !!!");
        } else if (amount < 0) {
            throw new BankAccountException("Negative balance !!!");
        } else {
            setBalance(balance - amount);
        }

    }
}
