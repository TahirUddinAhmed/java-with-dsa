package com.course.properties.inheritance.multilevelInheritance;

// Advcalc Inherits Calc
// VeryAdvCal inherits Advcalc

// Multilevel Inheritance 
//       Calc
//         |
//         |
//         |
//      Advcalc
//         |
//         |
//         |
//     VeryAdvcal

public class Main {
    public static void main(String[] args) {
        // super class 
        Calc c1 = new Calc();
        int add1 = c1.add(5, 7);

        // sub class
        Advcalc c2 = new Advcalc();
        int add2 = c2.add(78, 22);
        double div1 = c2.div(45, 4);

        VeryAdvCal c3 = new VeryAdvCal();
        int add3 = c3.add(42, 98);
        int mul1 = c3.mul(65, 65);
        double power = c3.power(5, 3);

        // System.out.println(add1);
        // System.out.println(add2); 
        // System.out.println(div1); 
        System.out.println(add3); 
        System.out.println(mul1); 
        System.out.println(power); 
        
    }
}
