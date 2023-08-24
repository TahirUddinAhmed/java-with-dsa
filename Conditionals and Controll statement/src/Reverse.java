import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = in.nextInt();
        int rem, rev = 0;

        while(num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        System.out.println(rev);

    }
}
