import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
        greet("Tahir");
    }
    // create a function sum()
    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;

        System.out.println("Sum is : " + sum);
    }

    // greeting function
    static void greet(String name) {
        System.out.println("Hello " + name + ", How are you?");
    }

}