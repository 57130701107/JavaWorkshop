/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author Student Lab
 */
public class TestProperty {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Properties p = new Properties();
        File f = new File("subject.properties");
        FileInputStream fin = new FileInputStream(f);
        p.load(fin);
        
        System.out.println(p.getProperty("INT675"));
        System.out.println(p.getProperty("sssw"));
        System.out.println(p.getProperty("999"));
    }
    
    
}
