import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();

        swap(num1, num2);
    }
    // Q: Create a function to swap two numbers
    static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of first number is now: " + a);
        System.out.println("Value of second number is now: " + b);
    }
}
