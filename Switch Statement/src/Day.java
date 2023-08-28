import java.sql.SQLOutput;
import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Day;
        System.out.print("Please enter a number (1 to 7): ");
        Day = in.nextInt();

        switch (Day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> {
                System.out.println("Wednesday");
                System.out.println("Happy Wednesday Someone");
            }
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Please enter a valid number");

        }



    }
}
