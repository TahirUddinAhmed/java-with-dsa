public class SearchInRange {
    public static void main(String[] args) {
        int[] rolls = {1, 3, 12, 98, 44, 6, 67};
        int target = 44;
        int start = 3;
        int end = 5;

        boolean ans = searchRange(rolls, target, start, end);
        System.out.println(ans);
    }

    // search in a range
    static boolean searchRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return false;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return true;
            }
        }

        return false;
    }

}
