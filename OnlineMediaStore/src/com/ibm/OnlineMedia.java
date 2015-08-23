/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Student Lab
 */
public class OnlineMedia {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("media.properties");
        try {
            prop.load(fis);
        } catch (IOException e) {
        }
        // Create a new object for getting property data
        DataFromProperties data = new DataFromProperties();

        // Create a new Order object
        Order anOrder = new Order();

        // add a number of dvds to the order
        int dvdsToBeAdded = 3;
        for (int dvdNumber = 1; dvdNumber <= dvdsToBeAdded; dvdNumber++) {
            // get the dvd data from the properties file
            DigitalVideoDisc dvd = data.addADvd(prop, dvdNumber);
            // add the dvd to the order
            anOrder.addDigitalVideoDisc(dvd);
        }

        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }

}
