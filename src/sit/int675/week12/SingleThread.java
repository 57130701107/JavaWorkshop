/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week12;

/**
 *
 * @author Student Lab
 */
public class SingleThread {
    
    static String x[] = new String[20_000_000];
    
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        
        InitArrayThread iat1,iat2,iat3,iat4;
        iat1 = new InitArrayThread(x, 0, 5_000_000, "ABCD");
        iat2 = new InitArrayThread(x, 5_000_001, 10_000_000, "EFGH");
        iat3 = new InitArrayThread(x, 0, 10_000_001, "IJKL");
        iat4 = new InitArrayThread(x, 0, 15_000_001, "XYZ");
        
        iat1.start();
        iat2.start();
        iat3.start();
        iat4.start();
        Thread.sleep(10000);
//        int count=0;
//        for (int i = 0; i < x.length; i++) {
//            x[i] = new String("ABCD");
//            if((i+1)%100_000==0){
//                System.out.print(".");
//                count++;
//                if(count%40==0){
//                    System.out.print("");
//                }
//            }
//        }
        
        
        
        System.out.println("Duration ="+(System.currentTimeMillis()-startTime));
        System.out.println(x[5_000_000]);
        System.out.println(x[19_999_999]);
    }
}
