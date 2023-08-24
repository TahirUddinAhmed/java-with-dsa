import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from the user while the user press x or X
        int res = 0;


        while(true) {
            System.out.print("Enter an operator: ");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                int num1, num2;
                System.out.print("Enter two numbers: ");
                num1 = in.nextInt();
                num2 = in.nextInt();

                switch(op) {
                    case '+':
                        res = num1 + num2;
                        break;
                    case '-':
                        res = num1 - num2;
                        break;
                    case '*':
                        res = num1 * num2;
                        break;
                    case '/':
                        if(num2 != 0) {
                            res = num1 / num2;
                        } else {
                            res = 0;
                            System.out.println("can't divide " + num1 + "/" + num2);
                        }
                        break;
                    case '%':
                        res = num1 % num2;
                        break;
                }

            } else if(op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println("Please enter a valid operator!");
            }

            System.out.println(res);
        }
    }
}
