/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week5;

 

/**
 *
 * @author Student Lab
 */
public class TestStaticNewJavaClass {

    public static int count = 0;
    public int x = 1;

    public static void main(String[] args) {
//        System.out.println("count=" + count);       
//        TestStaticNewJavaClass xxx = new TestStaticNewJavaClass();
//        System.out.println("x=" + xxx.x);

        TestStaticNewJavaClass ts1 = new TestStaticNewJavaClass();
        TestStaticNewJavaClass ts2 = new TestStaticNewJavaClass();
        ts2.x = 9;
        ts1.count = 900;

        System.out.println("ts1.x=" + ts1.x);
        System.out.println("ts2.x=" + ts2.x);
        System.out.println("ts2.count=" + ts2.count);
        System.out.println("count=" + TestStaticNewJavaClass.count);
        
        for (int i = 0; i < 10; i++) {
            new DemoStatic();
        }
        DemoStatic dm = new DemoStatic();
        System.out.println("Number of instant="+dm.getCountInstant());
        
        
        
        java.util.Date d1 = new java.util.Date();
        java.sql.Date d2 = new java.sql.Date(System.currentTimeMillis());
        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
    }

}

class DemoStatic {

    private static int countInstant = 0;

    public DemoStatic() {
        countInstant++;
    }

    public int getCountInstant() {
        return countInstant;
    }

}
