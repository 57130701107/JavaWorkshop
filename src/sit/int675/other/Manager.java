/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.other;

import java.text.DecimalFormat;
import sit.int675.week6.Employee;

/**
 *
 * @author Student Lab
 */
public class Manager extends Employee {

    public static int ST = 100;
    private final static double BONUS_RATE = 0.09;

    public double getBonus() {
        return super.getSalary() * BONUS_RATE;
    }

    public double getSalary() {
        return super.getSalary() + getBonus();
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        Manager m = new Manager();
        //Manager.BONUS_RATE = 5;

        m.id = 99999;
        //m.setId(10001);
        m.setName("xxxx");
        m.setSalary(1_000_000_000);

        System.out.printf("%s,Bonus: %s baht\n", m.getName(), df.format(m.getBonus()));
    }

}
