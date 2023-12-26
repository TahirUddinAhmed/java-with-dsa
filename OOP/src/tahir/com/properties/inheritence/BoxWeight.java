package tahir.com.properties.inheritence;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight () {
        this.weight = -1;
//        this.l = 2; // can't access private properties
    }

    public BoxWeight (double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        // used to initialise values present in parent class
        this.weight = weight;
    }
}
