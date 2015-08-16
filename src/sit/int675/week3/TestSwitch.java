/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week3;

import java.util.Scanner;

/**
 *
 * @author Student Lab
 */
public class TestSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String day = null;
        String color = null;

        do {
            System.out.println("Please enter day in string.");
            day = sc.next();
            switch (day) {
                case "monday":
                case "Monday":
                case "Mon":
                    color = "Yellow";
                    break;

                case "tuesday":
                case "Tuesday":
                case "Tue":
                    color = "Pink";
                    break;

                case "wednesday":
                case "Wednesday":
                case "Wed":
                    color = "Green";
                    break;

                case "thursday":
                case "Thursday":
                case "Thu":
                    color = "Orange";
                    break;

                case "friday":
                case "Friday":
                case "Fri":
                    color = "Blue";
                    break;

                case "saturday":
                case "Saturday":
                case "Sat":
                    color = "Purple";
                    break;

                case "sunday":
                case "Sunday":
                case "Sun":
                    color = "Red";
                    break;

                default:
                    color = "Invalid color.";
            }

            System.out.println("Day: " + day + ", Color: " + color);
        } while (!day.equalsIgnoreCase("stop"));
    }
}
