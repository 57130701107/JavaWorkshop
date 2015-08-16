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
public class TestConditionStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter int");
        int score = sc.nextInt();
        String grade = null;

        if (score < 50) {
            grade = "F";
        } else if (score < 60) {
            grade = "D";
        } else if (score < 70) {
            grade = "C";
        } else if (score < 80) {
            grade = "B";
        } else {
            grade = "A";
        }
        System.out.println("Score: " + score + ", Grade: " + grade);

        
        
//        int x = sc.nextInt();
//        if (x % 2 == 0) {
//            System.out.println(x + "is even");
//        } else {
//            System.out.println(x + "is odd");
//        }
    }
}
