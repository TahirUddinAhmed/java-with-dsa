import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        System.out.print("Please enter a number: ");
        num = in.nextInt();

        boolean ans = isPrime(num);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        boolean res = false;
        if(n == 1) {
            return false;
        }

        int c = 2;
        while(c < n) {
            if(n % c == 0) {
                res = false;
                break;
            } else {
                res = true;
            }
            c++;
        }

        return res;
    }
}
