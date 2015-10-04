/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student Lab
 */
public class TestException {

    public static void main(String[] args) {
        System.out.println("Main Active");
        methodA();
        System.out.println("Main Done");

        try {
            methodX();
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist!!!!");
        }
        
        int x = 10;
        assert x<10:"Value of x >= 10 ";
    }

    public static void methodA() {
        System.out.println("Method A Active");
        methodB();
        System.out.println("Method A Done");
    }

    public static void methodB() {
        System.out.println("Method B Active");
        int a[] = {1, 3, 5, 7, 9};
        String str = "";
        try {

            int x = 5;
            int y = 2;
            int z = x / y;
            System.out.println("z=" + z);
            System.out.println("a[0]" + a[0]);
            x = Integer.parseInt(str);
        } catch (ArithmeticException e) {
            System.out.println(e.getClass() + ", " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass() + ", " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getClass() + ", " + e.getMessage());
            return;
        } finally {
            System.out.println("Alway done");
        }

        System.out.println("Method B Done");
    }

    private static void methodX() throws FileNotFoundException {
        File f = new File("tmp.txt");
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, " ,.()'");
            int count = 1;
            while (stk.hasMoreElements()) {
                System.out.printf("%-20s%s", stk.nextElement(), (count++ % 8 == 0 ? "\n" : "\t"));
            }
        }
    }
}
