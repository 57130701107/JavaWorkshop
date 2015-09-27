/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Student Lab
 */
public class TestAlgorithm {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            lst.add((int) (Math.random() * 10000));
        }

        int count = 1;
        for (int x : lst) {
            System.out.print(x + (count++ % 10 == 0 ? "\n" : "\t"));
        }
        Collections.sort(lst);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nSearch for number(0 TO Exit):");
        int x = sc.nextInt();
        while(x>0)
        {
            int position = Collections.binarySearch(lst, x);
            if (position>=0) {
                System.out.println("Found "+x+" at "+position);
            }
            else
            {
                System.out.println(position+" does not exist....");
            }
            System.out.print("Search for number(0 TO Exit):");
            x = sc.nextInt();
        }
    }
}
