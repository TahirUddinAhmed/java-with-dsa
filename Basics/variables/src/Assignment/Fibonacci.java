package Assignment;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Q: To calculate Fibonacci Series up to n numbers.
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = in.nextInt();

        int previousNum = 0;
        int currentNumber = 1;
        int count = 2;

        while(count <= num) {
            int temp = currentNumber; // temp = 5
            currentNumber = currentNumber + previousNum; // current = 8
            previousNum = temp; // pre = 5
            count++;
        }

        System.out.println(currentNumber);
    }
}
