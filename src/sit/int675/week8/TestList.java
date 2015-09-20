/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import sit.int675.week7.Circle;
import sit.int675.week7.Geometric;
import sit.int675.week7.Rectangle;
import sit.int675.week7.Triangle;

/**
 *
 * @author Student Lab
 */
public class TestList {

    public static void main(String[] args) {

        //List lst = new ArrayList();
        List lst = new LinkedList();

        for (int i = 0; i < 100; i++) {

            double r = Math.random();
            Geometric gm = null;
            if (r < 0.4) {
                gm = new Circle((int) (Math.random() * 10));
            } else if (r < 7.5) {
                gm = new Rectangle((int) (Math.random() * 10), (int) (Math.random() * 10));
            } else {
                gm = new Triangle((int) (Math.random() * 10), (int) (Math.random() * 10));
            }

            lst.add(gm);

        }

        lst.add(new String("Somchai"));
        lst.add(new Integer(999));

        System.out.println(lst.get(0));
        System.out.println(lst.get(lst.size() - 1));
        System.out.println(lst.get(lst.size() - 2));

        Iterator it = lst.iterator();

//        for (Object obj : lst) {
//            if (obj instanceof Geometric) {
//
//                if (obj instanceof Circle) {
//                    System.out.println("Circle :" + ((Geometric) obj).getArea());
//                } else if (obj instanceof Triangle) {
//                    System.out.println("Triangle :" + ((Geometric) obj).getArea());
//                } else if (obj instanceof Rectangle) {
//                    System.out.println("Rectangle :" + ((Geometric) obj).getArea());
//                } else {
//                    System.out.println(obj);
//                }
//            } else {
//                System.out.println(obj);
//            }
//        }
        
        while (it.hasNext()) {
            Object obj = it.next();
            if (obj instanceof Geometric) {

                if (obj instanceof Circle) {
                    System.out.println("Circle :" + ((Geometric) obj).getArea());
                } else if (obj instanceof Triangle) {
                    System.out.println("Triangle :" + ((Geometric) obj).getArea());
                } else if (obj instanceof Rectangle) {
                    System.out.println("Rectangle :" + ((Geometric) obj).getArea());
                } else {
                    System.out.println(obj);
                }
            } else {
                System.out.println(obj);
            }
        }

    }

}
