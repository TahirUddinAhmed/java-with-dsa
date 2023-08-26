package Assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q: Fibonacci series
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int a = 0;
        int i = 1;
        int count = 2;

        System.out.print(a + " ");
        System.out.print(i + " ");
        while(count <= n) {
            int temp = i;
            i += a;
            System.out.print(i + " ");
            a = temp;

            count++;
        }
    }
}
