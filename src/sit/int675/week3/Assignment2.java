/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week3;

import java.util.Scanner;

/**
 *
 * @author Student Lab
 */
public class Assignment2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not prime number");
                break;
            }
        }
        if (num != 0) {
            System.out.println(num + " is prime number");
        }
        
        
        
        
        
        
    }


}
