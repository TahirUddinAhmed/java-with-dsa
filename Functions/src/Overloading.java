import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        int sum1 = sum(12, 4);
        int sum2 = sum(12, 3, 8);
        System.out.println("value of sum1 is " + sum1);
        System.out.println("Value of sum 2 is " + sum2);

        // fun method
        fun(112);
        fun("Tahir uddin ahmed");

        demo(1, 2, 3, 4, 5);
        demo("tahir", "Ronaldo", "Mesi");

    }

    // var args overloading
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }



    static void fun(int a) {
        System.out.println("First function is run: ");
        System.out.println("value is " + a);
    }

    static void fun(String name) {
        System.out.println("Second function is run: ");
        System.out.println(name);
    }

}
