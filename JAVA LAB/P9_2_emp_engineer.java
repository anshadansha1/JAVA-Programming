/*PROGRAM 9_2 : Write two Java classes Employee and Engineer. Engineer should inherit from Employee class.
 Employee class to have two methods display() and calcSalary().
Write a program to display the engineer salary and to display from Employee class using a single object instantiation (i.e., only one object creation is allowed).  
    •display() only prints the name of the class and does not return any value. Ex. “ Name of class is Employee.”  
    •calcSalary() in Employee displays “Salary of employee is 10000” and calcSalary() in Engineer displays “Salary of employee is 20000.” 
 */

import java.util.Scanner;

class Employee {
    public void display() {
        System.out.println("Name of class is Employee.");
    }
    public void calcSalary() {
        System.out.println("Salary of employee is 10000.");
    }
}

class Engineer extends Employee {
    public void calcSalary() {
        System.out.println("Salary of employee is 20000.");
    }
}

public class P9_2_emp_engineer {
    public static void main(String[] args) {
        Employee emp = new Engineer(); // Polymorphism: Employee reference, Engineer object
        emp.display(); // Calls display method of Employee class
        emp.calcSalary(); // Calls calcSalary method of Engineer class
    }
}