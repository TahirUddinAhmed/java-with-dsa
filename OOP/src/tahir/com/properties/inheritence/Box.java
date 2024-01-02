package tahir.com.properties.inheritence;

// whenever you create a class as final, implicitly the class methods are final too
public class Box {
    private double l;
    double h;
    double w;

    static void greeting() {
        System.out.println("Hey I am in box class");
    }
    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box (double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box (double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // copy constructor
    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }

    public void show() {
        System.out.println("l:" + this.l + " h:" + this.h + " w:" + this.w);
    }
}
