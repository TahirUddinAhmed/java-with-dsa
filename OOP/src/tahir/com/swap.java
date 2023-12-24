package tahir.com;

import static tahir.com.Message.message;

public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        swap(a, b);

        message();


    }

    static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Swap the numbers");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
