package tahir.com.properties.inheritence;

public class Box {
    private double l;
    double h;
    double w;

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
