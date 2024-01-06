package com.course.intro;

public class Student {
    String name;
    int age;
    int roll_no;
    double marks;

    // constructor 
    // default constructor
    Student () {
        // this.name = null;
        // this.age = 0;
        // this.roll_no = 0;
        // this.marks = 0.0;
    }
    // parameterized constructor
    Student (String name, int age, int roll_no, double marks) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    // copy constructor
    Student (Student other) {
        this.name = other.name;
        this.age = other.age;
        this.roll_no = other.roll_no;
        this.marks = other.marks;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Tahir uddin ahmed", 21, 34, 89.76);
        Student s2 = new Student("Ayan Ahmed", 19, 1, 99.89);
        Student s3 = new Student();

        Student s4 = new Student(s1);
    
        // print 
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s2.marks);
        System.out.println(s3.name);
        System.out.println(s3.age);

        System.out.println(s4.name);
    }

}
