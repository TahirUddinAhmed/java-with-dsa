import java.util.Arrays;

public class Search2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {15, 8, 45},
                {56, 101, 125, 9},
                {84, 71, 28}
        };
        int target = 125;

        int[] ans = search2(arr, target);

        System.out.println(search(arr, target));
        System.out.println(Arrays.toString(ans));

    }

    // linear search 2D array - return true if found - else return false
    static boolean search(int[][] arr, int target) {
        if(arr.length == 0) {
            return false;
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                int element = arr[i][j];
                if(element == target) {
                    return true;
                }
            }
        }

        // if none of the return statement is executed - return false
        return false;
    }

    // search 2d array - return another array which consist of row index and column index
    static int[] search2(int[][] arr, int target) {
        if(arr.length == 0) {
            return new int[]{-1, 1};
        }

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};

    }

}
