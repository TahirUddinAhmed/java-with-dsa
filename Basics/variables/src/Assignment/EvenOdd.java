package Assignment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
       // Q: Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in = new Scanner(System.in);
        int num; // declare num variable

        System.out.print("Please enter a number: ");
        num = in.nextInt(); // take input as integer from user

        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd!");
            }
        }
    }
}
