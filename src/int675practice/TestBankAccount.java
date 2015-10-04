/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice;

import sit.int675.demo.BankAccount;
import sit.int675.week4.BankAccountException;

/**
 *
 * @author Student Lab
 */
public class TestBankAccount {

    public static void main(String[] args) throws BankAccountException {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.setAccountId(90001);
        ba.setName("AAAAA");

        BankAccount bb = new BankAccount();
        bb.setAccountId(99999);
        bb.setName("BBBBB");
        bb.withdraw(-1000);

        System.out.println("Account ID:" + ba.getAccountId());
        System.out.println("Account Name:" + ba.getName());
        System.out.println("Balance:" + ba.getBalance());
        System.out.println(".............................");
        System.out.println("Account ID:" + bb.getAccountId());
        System.out.println("Account Name:" + bb.getName());
        System.out.println("Balance:" + bb.getBalance());
        
        
        StringBuilder sb = new StringBuilder();
        sb.append(9999.99);
        sb.append("sssss");
        sb.insert(3, "-----");
        System.out.println(sb);
    }

}
