public class Main {
    public static void main(String[] args) {
        // data of 5 students: {roll, marks, names}
        Student s1;
        s1 = new Student();
        Student s2 = new Student(24, "Minju Begum", 88.56);
        Student random = new Student(s2);

        // initializing value to objects properties
//        s1.name = "Tahir uddin ahmed";
//        s1.roll = 34;
//        s1.marks = 98.99;
//        s1.changeName("Ayan");
//        s1.greetings();

////        System.out.println(s1.name);
//        System.out.println(s1.roll);
//        System.out.println(s1.marks);

//        s2.greetings();
//        System.out.println(s2.roll);
//        System.out.println(s2.marks);
//
//        System.out.println(random.name);
//        System.out.println(random.roll);
//        System.out.println(random.marks);

        final A tahir = new A("Tahir uddin ahmed");

        // when a non primitive is final, you cannot reassign it
//        tahir = new A("new name");

//        System.out.println(tahir.name);

    }
}

class A {
    final int num = 10;
    String name;

    A (String name) {
        System.out.println("Object is being created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}

// create a class
class Student {
    // properties
    int roll;
    double marks;
    String name;

    // constructor
    Student () {
//        this.roll = 34;
//        this.marks = 98.4;
//        this.name = "Tahir uddin ahmed";

        // this is how you call a constructor from another constructor.

        this (34, "Tahir Uddin Ahmed", 98.89);
    }

    // Student ayan = new Student(17, "ayan", 64.5);
    // here, `this` will be replaced with ayan
    Student (int rno, String name, double marks) {
        this.roll = rno;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }

    void greetings() {
        System.out.println("Hello, How are you?\nI'm " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }



}

