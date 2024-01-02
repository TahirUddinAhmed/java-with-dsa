package tahir.com.properties.inheritence;

public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        Box cube = new Box(6);
        Box b2 = new Box(12, 6, 8);
        Box b3 = new Box(cube);

//        BoxWeight b4 = new BoxWeight();
//        BoxWeight b5 = new BoxWeight(4, 3, 7, 12);

//        b4.show();
//        b5.show();
//        System.out.println("weight: " + b5.weight);


//        Box b6 = new BoxWeight(2, 5, 7, 10);

//        b6.show();
//        System.out.println(b6.weight);

//        b.show();
//        cube.show();
//        b2.show();
//        b3.show();

//        BoxPrice box = new BoxPrice();
//        System.out.println(box.cost);
//        b.greeting();
        Box.greeting();

        Box box = new BoxWeight();

        box.greeting();
    }
}

// types of inheritance
// 1. Single inheritance: One class extends another class.
// means only once class is derived from the parent class.

// 2. Multi-level inheritance:
// The multi-level inheritance includes the involvement of at
// least two or more than two classes. One class inherits the features
// from a parent class and the newly created sub-class becomes the base for
// another new class.

// 3. Multiple inheritance:
// One class extending more than 1 classes. (Multiple inheritance does not support
// multiple inheritance)

// 4. Hierarchical inheritance
// One class is inherited by many classes.
// if a number of classes is inherited from one base class, it is call hierarchical inheritance.

// 5. Hybrid Inheritance:
// Combination of single and multiple inheritance.
//