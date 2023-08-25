package Assignment;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Q: To find Armstrong Number between two given number

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int rem, res = 0, temp = num;

        while(num > 0) {
            rem = num % 10;
            res += rem * rem * rem;
            num = num / 10;
        }
        // check condition
        if(res == temp) {
            System.out.println(temp + " is a armstrong number!");
        } else {
            System.out.println(temp + " is not a armstrong number");
        }



    }
}
