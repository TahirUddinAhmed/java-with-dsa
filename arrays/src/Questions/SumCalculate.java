package Questions;

import java.util.Scanner;

public class SumCalculate {
    public static void main(String[] args) {
        // Q: Write a program to Calculate the sum of all elements in an integer array.
        Scanner in = new Scanner(System.in);
        int size;
        System.out.print("Enter how many numbers you want to add: ");
        size = in.nextInt();

        int[] nums = new int[size];

        // INPUT
        System.out.print("Enter the numbers: ");
        for(int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        // ADD
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Sum of all the numbers is " + sum);


    }
}
