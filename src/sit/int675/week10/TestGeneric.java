/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week10;

import java.util.ArrayList;
import java.util.List;
import sit.int675.week7.Circle;
import sit.int675.week7.Geometric;
import sit.int675.week7.Rectangle;

/**
 *
 * @author Student Lab
 */
public class TestGeneric {
    
    public static void main(String[] args) {
        
        List<Geometric> list = new ArrayList();
        list.add(new Circle(1.2));
        list.add(new Circle(2.2));
        list.add(new Circle(3.2));
        list.add(new Circle(4.2));
        list.add(new Circle(5.2));
        list.add(new Circle(1.5));
        list.add(new Circle(1.9));
        list.add(new Circle(5.0));
        list.add(new Rectangle(5.0,1.0));
        list.add(new Rectangle(5.0,1.0));
        list.add(new Rectangle(5.0,1.0));
        
        //list.add(new Character('1'));
        
        for (Geometric x : list) {
            //Circle c = (Circle)x;
            System.out.println("Area:"+x.getArea());
        }
    }
    
    
}
