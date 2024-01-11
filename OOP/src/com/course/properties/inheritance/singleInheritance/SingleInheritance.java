package com.course.properties.inheritance.singleInheritance;

// super class or parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }

    void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

// sub class or child class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// another example 
class Calc {
    double a, b;

    public Calc(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println(a + b);
    }

    public void sub() {
        System.out.println(a - b);
    }
}

class Advcalc extends Calc {

    public Advcalc(double a, double b) {
        super(a, b);
    }
    public void mul() {
        System.out.println(this.a * this.b);
    }
    public void division() {
        System.out.println(this.a / this.b);
    }
}



public class SingleInheritance {
    public static void main(String[] args) {
        Car c1 = new Car();

        // c1.start();
        // c1.drive();
        // c1.stop();

        Advcalc cal1 = new Advcalc(5, 2);

        cal1.add();
        cal1.sub();
        cal1.mul();
    }
}
