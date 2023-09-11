import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num;
        System.out.println("Please enter a number: ");
        num = in.nextInt();
        int res = 0;
        
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                res = 0;
                break;
            } else {
                res = 1;
            }

        }

        if(num > 1) {
            if(res == 1) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        } else if(num == 1) {
            System.out.println("Not Prime");
        }

    }
}
