
public class MultidimensionalArr {
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // we can also initialize the array like this
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };

        // print -> 2D array
        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
