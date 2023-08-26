package Assignments;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q: Find the area of a circle
        double PI = 3.14;
        System.out.print("Enter radius of a circle: ");
        int r = in.nextInt();

        double circleArea = PI * (r * r);
        System.out.println("Area of circle is : " + circleArea);

        // Q: Find the area of triangle
        System.out.print("Enter base & height of triangle: ");
        double base = in.nextDouble();
        double height = in.nextDouble();
        double triangleArea = base * height;
        System.out.println("Area of triangle is : " + triangleArea);

        // Q: Find the area of rectangle
        System.out.print("Input the length and width of rectangle: ");
        double l = in.nextDouble();
        double w = in.nextDouble();
        double rectArea = 2 * (l + w);
        System.out.println("Area of rectangle is : " + rectArea);



    }
}
