/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Student Lab
 */
public class TestSet {

    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("Somchai");
        s.add("Somsak");
        s.add("Somsri");
        s.add("Somchai");
        s.add("Somchai");
        System.out.println(s);
        
        Set ts = new TreeSet();
        ts.add("Pichet");
        ts.add("Pichai");
        ts.add("Pichit");
        ts.add("Picharn");
        ts.add("Picharn");
        System.out.println(ts);
        
        
        s.addAll(ts);
        System.out.println(s);
        
        s.retainAll(ts);
        System.out.println(s);
    }

}
