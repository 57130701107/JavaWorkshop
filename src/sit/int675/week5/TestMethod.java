/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week5;

import java.util.logging.Level;
import java.util.logging.Logger;
import sit.int675.demo.BankAccount;
import sit.int675.week4.BankAccountException;

/**
 *
 * @author Student Lab
 */
public class TestMethod {

    public static void main(String[] args) {

//        double x = Math.pow(2, 5);
//        System.out.println(Math.pow(7, 7) * 2.0);
//        System.out.println(5 * 2);
//
//        long now = System.currentTimeMillis();
//        long nowMoreAccurate = System.nanoTime();
//        System.out.println("Now=" + now);
//        System.out.println("nowMoreAccurate=" + nowMoreAccurate);
        
        
        BankAccount ba = new BankAccount();
        ba.setAccountId(1001);
        ba.setName("man");
        ba.setBalance(5000);
        
        System.out.printf("%10d %-20s %10.2f \n",ba.getAccountId(),ba.getName(),ba.getBalance());
        foo(ba);
        System.out.printf("%10d %-20s %10.2f \n",ba.getAccountId(),ba.getName(),ba.getBalance());
        bar(ba);
        System.out.printf("%10d %-20s %10.2f \n",ba.getAccountId(),ba.getName(),ba.getBalance());
    }
    
    public static void foo(BankAccount ba) {
        try {
            ba.deposit(9000);
        } catch (BankAccountException ex) {
            Logger.getLogger(TestMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void bar(BankAccount ba) {
        ba = new BankAccount();
        try {
            ba.deposit(10000);
        } catch (BankAccountException ex) {
            Logger.getLogger(TestMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
