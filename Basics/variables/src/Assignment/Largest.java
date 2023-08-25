package Assignment;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // Q: Take 2 numbers as input and print the largest number
        Scanner in = new Scanner(System.in);

        int num1, num2, big;
        System.out.print("Enter two numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        // largest of two numbers
        if(num1 > num2) {
            big = num1;
        }  else {
            big = num2;
        }

        System.out.println("Largest numbers is : " + big);

    }
}
