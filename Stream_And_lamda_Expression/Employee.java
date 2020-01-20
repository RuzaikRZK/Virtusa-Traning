/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author RZK Technology
 */
public class Employee {

    String name;
    int marks;

    public Employee(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Compare {

    public int Compare(Employee e1, Employee e2) {

        if (e1.getMarks() > e2.getMarks()) {
            return +1;
        }

        if (e1.getMarks() < e2.getMarks()) {
            return -1;
        }

        return 0;

    }

}

class Test_app {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ruzaik", 90);
        Employee e2 = new Employee("Shaham", 75);

        List<Employee> customers = Arrays.asList(e1, e2);

        Comparator<Employee> emp = (e, ee) -> (ee.getMarks() > e2.getMarks() ? +1
                : e1.getMarks() < e2.getMarks() ? -1 : 0);

        //Collections.sort(e1,emp);
        //System.out.println(emp.compare(e1, e2));
        Collections.sort(customers, emp);
        System.out.println(emp);

    }

}
