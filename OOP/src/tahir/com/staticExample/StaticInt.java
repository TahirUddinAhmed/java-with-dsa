package tahir.com.staticExample;

// this is a demo to show initialisation of static variables
public class StaticInt {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is created i.e when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);

        StaticInt.b += 4;

        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);
    }
}
