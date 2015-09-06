/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week7;

/**
 *
 * @author Student Lab
 */
public class testGeometric {

    public static void main(String[] args) {
        Geometric[] g = new Geometric[10];
        for (int i = 0; i < g.length; i++) {

            double r = Math.random();
            if (r < 0.4) {
                g[i] = new Circle((int)( Math.random() * 10));
            } else if (r < 7.5) {
                g[i] = new Rectangle((int)( Math.random() * 10), (int)( Math.random() * 10));
            } else {
                g[i] = new Triangle((int)( Math.random() * 10), (int)( Math.random() * 10));
            }
            g[i].setColor("xxx");
            
        }
        
        for (int i = 0; i < g.length; i++) {
            
            System.out.println(g[i]+"Area:"+g[i].getArea()+",Perimeter:"+g[i].getPerimeter()+",Color:"+g[i].getColor());
            
        }
    }

}
