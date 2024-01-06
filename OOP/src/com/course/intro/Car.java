package com.course.intro;

public class Car {
    double price;
    String name;
    String model;

    // method
    public void printDetails() {
        System.out.println("car name = " + this.name);
        System.out.println("Model No = " +this.model);
        System.out.println("price = " + this.price);
    }

    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.name = "Toyota";
        toyota.model = "T-20104";
        toyota.price = 1500000;

        toyota.printDetails();
    }
}