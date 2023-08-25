package Assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Q: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in = new Scanner(System.in);

        int principal, time;
        double rate;

        System.out.print("Enter principal, time, and rate: ");
        principal = in.nextInt();
        time = in.nextInt();
        rate = in.nextDouble();

        double simpleInterest = (principal * time * rate) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

    }
}
