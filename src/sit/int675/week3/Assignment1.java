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
public class Assignment1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String str = sc.nextLine().toUpperCase();
        
        int ch[] = new int[26];
        
        for (int i = 0;i < str.length(); i++) {
            char x  =str.charAt(i);
            if(x>=65 && x <=65+25)
            {
                ch[x-65]++;
            }
        }
        
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>0)
            {
            
                System.out.println((char)(i+65)+": "+ch[i]);
            
            }
        }
             
    }
}
