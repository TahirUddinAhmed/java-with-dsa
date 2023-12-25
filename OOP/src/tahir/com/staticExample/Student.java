package tahir.com.staticExample;

class St {
    int roll;
    String class_name;
    double marks;
    static String principle;

    // static block
    // static block will execute when you load a class
    // class load only once
    static {
        principle = "Ayan";
        System.out.println("In static");
    }

    // constructor will execute when you create an object
    St () {
        roll = 0;
        marks = 0;
        class_name = "";
        System.out.println("In Constructor");
    }

    public void show() {
        System.out.println(this.roll + " : " + this.class_name + " : " + this.marks + " : " + this.principle);
    }
}

public class Student {
    int i = 0;
    static int j = 2;

    public static void main(String[] args) {
//        i = 9; // cannot use non static variables in static block
        j = 5;
        System.out.println(j);

        St john = new St();
        john.roll = 34;
        john.class_name = "BCA 5th semester";
        john.marks = 65.78;
//        St.principle = "Peter";

        St mario = new St();
        mario.roll = 23;
        mario.class_name = "BCA 3rd semester";
        mario.marks = 98.76;
//        St.principle = "Peter"; // we don't need object

//        St.principle = "Ayan";

        St nandi = new St();

        john.show();
        mario.show();
        nandi.show();
    }
}

/*
*  static variables are same for all the objects .
*  Non-static variables are different for all the objects
*  cannot use non-static variables in static block
* */

