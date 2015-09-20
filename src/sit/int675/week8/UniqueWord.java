/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week8;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Student Lab
 */
public class UniqueWord {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set s = new TreeSet();
        String str = sc.nextLine();
        
       // while(str != null){
            StringTokenizer stk = new StringTokenizer(str," ;,.'\"*(){}");
            while(stk.hasMoreTokens()){
                String x = stk.nextToken();
                s.add(x);
            }
            //str = sc.nextLine();
      //  }
        
        //Iterator it = s.iterator();
        int i=1;
        for(Object x : s){
            //System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvv");
            System.out.print(x+(i++%8==0?"\n":"\t"));
            //System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }
    }
    
}
