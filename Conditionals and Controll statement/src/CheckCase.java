import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char ch = in.next().trim().charAt(0);

        // check conditions
        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }


    }

}
