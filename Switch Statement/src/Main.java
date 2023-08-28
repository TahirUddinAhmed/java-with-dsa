import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter fruit name: ");
        String fruit = in.next();

//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits!");
//                break;
//            case "Apple":
//                System.out.println("Healthy Fruits");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//        }


        // Enhance switch statement
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits!");
            case "Apple" -> System.out.println("Healthy Fruits");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}