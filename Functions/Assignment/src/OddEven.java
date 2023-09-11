import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        System.out.print("Please enter a number: ");
        num = in.nextInt();

        if(Even(num) == true) {
            System.out.println(num + " is even");
        }
        if(Odd(num) == true) {
            System.out.println(num + " is odd");
        }

    }

    // Q: Define a program to find out whether a given number is even or odd.
    static boolean Even(int n) {
        boolean isEven = false;
        if(n % 2 == 0) {
            isEven = true;
        }

        return isEven;
    }

    static boolean Odd(int n) {
        boolean isOdd = false;
        if(n % 2 != 0) {
            isOdd = true;
        }

        return isOdd;
    }



}
