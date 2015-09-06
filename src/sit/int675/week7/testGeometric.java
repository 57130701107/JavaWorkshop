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
                g[i] = new Circle((int) (Math.random() * 10));
            } else if (r < 7.5) {
                g[i] = new Rectangle((int) (Math.random() * 10), (int) (Math.random() * 10));
            } else {
                g[i] = new Triangle((int) (Math.random() * 10), (int) (Math.random() * 10));
            }
            g[i].setColor("xxx");

        }

        for (int i = 0; i < g.length; i++) {

            System.out.println(g[i] + "Area:" + g[i].getArea() + ",Perimeter:" + g[i].getPerimeter() + ",Color:" + g[i].getColor());

        }

        Geometric gx = new Circle();
        Circle c = (Circle) gx;
        Rectangle r = new Rectangle();

        System.out.println("Name(Geometric):" + gx.name);
        System.out.println("Name(Circle):" + c.name);
        System.out.println("Name(Rectangle):" + r.name);
        System.out.println("Name(Geometric):" + ((Geometric) r).name);

        System.out.println(gx.compareTo(r));
         System.out.println(gx + ",Area:" + gx.getArea());
         System.out.println(r + ",Area:" + r.getArea());
        
        String a = new String("ABCDE");
        String b = new String("XBCDE");
//        System.out.println(a.compareTo(b));
//        System.out.println(b.compareTo(a));
//        System.out.println(a.compareTo(a));
        if (a.compareTo(b) < 0) {
            System.out.println("a<b");
        } else if (a.compareTo(b) > 0) {
            System.out.println("a>b");
        }else{
            System.out.println("a=b");
        }
    }

}
