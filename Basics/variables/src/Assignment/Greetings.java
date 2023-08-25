package Assignment;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        // Q: Take name as input and print a greeting message for that particular name.
        Scanner in = new Scanner(System.in);
        String name;

        System.out.print("Enter your name: ");
        name = in.nextLine();

        System.out.println("Hello " + name + ", Welcome to the world of Java Programming!");

    }

}
