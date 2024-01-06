package com.course.properties.polymorphism;

public class Human {
    int age;
    String sex;

    public Human (int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public void printInfo(int age) {
        System.out.println(this.age);
    }

    public void printInfo(String sex) {
        System.out.println(this.sex);
    }

    public void printInfo(int age, String sex) {
        System.out.println(this.age + " " + this.sex);
    }


    public static void main(String[] args) {
        Human h1 = new Human(21, "Male");

        h1.printInfo(h1.age);
        h1.printInfo(h1.age, h1.sex);
    }
}
