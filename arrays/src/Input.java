import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.print("Enter marks of 5 students: ");
        for(int i = 0; i < marks.length; i++) {
            marks[i] = in.nextInt();
        }

        System.out.println("Marks is listed below: ");
        for(int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }
}
