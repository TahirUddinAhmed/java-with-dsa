public class Main {
    public static void main(String[] args) {
        // conditional statement
        // there are two conditional statement - 1. if else statment 3. switch statement

//        if(false) {
//            System.out.println("Hi, I am tahir");
//        } else {
//            System.out.println("Hi, I am a alien!");
//        }

        int a = 15;

        if(a >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You're a Minor");
        }


        // switch statement
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Please enter a valid input");
        }

    }
}