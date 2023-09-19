public class Search2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {15, 8, 45},
                {56, 101, 125, 9},
                {84, 71, 28}
        };
        int target = 20;

        System.out.println(search(arr, target));
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

}
