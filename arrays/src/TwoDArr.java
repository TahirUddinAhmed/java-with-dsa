import java.util.Scanner;

public class TwoDArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declare a two D array
        int[][] numbers = new int[3][3];

//        System.out.println(numbers.length);
        // input 2D array -> from the user
        for(int row = 0; row < numbers.length; row++) {
            System.out.println("Please enter the " + (row+1) + " row - ");
            for(int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = in.nextInt();
            }
        }

        // print 2D array
        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
    }
}
