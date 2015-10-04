/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week4;

/**
 *
 * @author Student Lab
 */
public class BankAccountException extends Exception{

    public BankAccountException() {
        super("Unknow Exception");
    }

    public BankAccountException(String message) {
        super(message);
    }
    
}
