package tahir.com.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}

// Types of polymorphism
// 1. Compile time/ static polymorphism:
// this is achieved VIA method overloading.

// 2. Runtime/Dynamic Polymorphism
// achieved by method overriding.