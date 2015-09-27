/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import sit.int675.week9.WordElement;
import sit.int675.week9.WordElementCompareByCount;

/**
 *
 * @author Student Lab
 */
public class WordFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map m = new TreeMap();
        String str = sc.nextLine();
        StringTokenizer stk = new StringTokenizer(str, " ;,.'\"*(){}");
        while (stk.hasMoreTokens()) {
            String x = stk.nextToken().toLowerCase();
            if (m.get(x) == null) {
//                m.put(x, new Integer(1));
                  m.put(x, new WordElement(x,1));
            } else {
//                Integer tmp = (Integer) m.get(x);
//                m.put(x, new Integer(tmp.intValue() + 1));
                  WordElement tmp = (WordElement) m.get(x);
                  tmp.increment();
            }
        }

//        Set entry = m.entrySet();
//        Iterator it = entry.iterator();
        
        Collection c = m.values();
        List lst = new ArrayList(c);
        
        Collections.sort(lst,new WordElementCompareByCount());
        //Collections.reverse(lst);
        
        Iterator it = lst.iterator();
        while (it.hasNext()) {
//            Entry e = (Entry) it.next();
//            System.out.println(e.getKey() + " : " + e.getValue());
            WordElement we = (WordElement) it.next();
            System.out.println(we.getWord()+ " : " + we.getCount());
        }
    }
}
