import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
       // loop
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter any number you want: ");
        n = input.nextInt();

//        for(int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }
       //// while loop
        /*
            Syntax:
               while(condition) {
                 body
                 increment/decrement;
               }


         */
//        int i = 1;
//        while(i <= n) {
//            System.out.println(i);
//            i++;
//        }

        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        }while(i <= n);


    }
}
