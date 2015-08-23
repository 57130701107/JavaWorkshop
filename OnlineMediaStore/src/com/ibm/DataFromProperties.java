/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm;

import java.util.Properties;

/**
 *
 * @author Student Lab
 */
public class DataFromProperties {

    public DigitalVideoDisc addADvd(Properties properties, int dvdIndex) {
        // set up the keys to read from the properties file
        String titleKey = new StringBuffer().append("dvd").append(dvdIndex).append(".title").toString();
        System.out.print(titleKey + " = ");
        String categoryKey = new StringBuffer().append("dvd").append(dvdIndex).append(".category").toString();
        String costKey = new StringBuffer().append("dvd").append(dvdIndex).append(".cost").toString();
        String directorKey = new StringBuffer().append("dvd").append(dvdIndex).append(".director").toString();
        String lengthKey = new StringBuffer().append("dvd").append(dvdIndex).append(".length").toString();
        // Create a new dvd object and set the fields
        DigitalVideoDisc dvd = new DigitalVideoDisc();
        dvd.setTitle(properties.getProperty(titleKey));
        System.out.println(dvd.getTitle());
        dvd.setCategory(properties.getProperty(categoryKey));
        dvd.setCost(Float.parseFloat(properties.getProperty(costKey)));
        dvd.setDirector(properties.getProperty(directorKey));
        dvd.setLength(Integer.parseInt(properties.getProperty(lengthKey)));
        return dvd;
    }
}
