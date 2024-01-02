package tahir.com.properties.polymorphism;

public class Objectprint {
    int num;

    public Objectprint (int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "Num=" + num +
                '}';
    }


    public static void main(String[] args) {
        Objectprint obj = new Objectprint(23);

        System.out.println(obj);
    }
}
