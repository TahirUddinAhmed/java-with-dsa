package tahir.com.properties.polymorphism;

public class Numbers {

    // method overloading
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();

        int sum1 = num.sum(2, 3);
        int sum2 = num.sum(4, 7, 11);
        double sum3 = num.sum(4.2, 4);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
