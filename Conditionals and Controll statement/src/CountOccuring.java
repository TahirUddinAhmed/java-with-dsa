import java.util.Scanner;

public class CountOccuring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = in.nextInt();
        System.out.println("Which number you want to check count occuring?");
        int check = in.nextInt();
        int rem;
        int count = 0;
        int temp;
        temp = n;
//        Q: How many times the number 4 is occuring
        while(n > 0) {
            rem = n % 10;

            if(rem == check) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(check + " is occuring " + count + " times in " + temp);
    }
}
