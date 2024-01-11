package com.course.properties.inheritance.MethodOverriding;

class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}

class Advcal extends Calc {
    
    @Override
    public int add(int a, int b) {
        return a + b + 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        int add1 = c1.add(1, 6);

        Advcal c2 = new Advcal();
        int add2 = c2.add(2, 23);

        System.out.println(add1);
        System.out.println(add2);

    }
    
}
