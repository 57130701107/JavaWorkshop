/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week6;

import java.util.Objects;

/**
 *
 * @author Student Lab
 */
public class Employee {

    public static String ST = "STATIC String";
    protected int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Employee other = (Employee) obj;
//        if (this.id != other.id) {
//            return false;
//        }
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        return true;
//    }
//
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + getSalary() + '}';
    }
//
//    
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id = 100;
        e1.name = "somchai";
        e1.salary = 53000;

        e2.id = 100;
        e2.name = "somchai";
        e2.salary = 53000;

        System.out.println(e1.equals(e2));
        System.out.println(e1.toString());
        System.out.println(e2);
        System.out.println(e2.getClass());
    }
}
