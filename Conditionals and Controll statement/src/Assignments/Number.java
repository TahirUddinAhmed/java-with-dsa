package Assignments;

import java.util.Scanner;

public class Number {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a three or four digit number: ");
        int n = in.nextInt();
        int rem, add = 0, sub = 0, product = 1;
        while(n > 0) {
            rem = n % 10; // get the last digit
            add += rem;
            sub -= rem;
            product *= rem;
            n /= 10; // remove the last digit
        }

        System.out.println(add);
        System.out.println(sub);
        System.out.println(product);
    }
}
