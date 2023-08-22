import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollNo;
        System.out.print("Please enter your roll number: ");
        rollNo = input.nextInt();

        float per;
        System.out.print("Please enter your percentage: ");
        per = input.nextFloat();

//       numbers
        int money = 234_000_000;

        // string is not a primitive data type
//        System.out.println("Please enter you name: ");
//        String name = input.nextLine();


        System.out.println("Your roll number is " + rollNo);
        System.out.println("Your percentage is " + per);
//        System.out.println(name);
        System.out.println(money);


    }
}
