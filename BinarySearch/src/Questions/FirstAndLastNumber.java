package Questions;

import java.util.Arrays;

public class FirstAndLastNumber {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 5;
        // output = [1, 2]
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
      int[] ans = {-1, -1};

      int start = search(nums, target, true);
      int end = search(nums, target,false);

      ans[0] = start;
      ans[1] = end;

      return ans;
    }

    static int search(int[] arr, int target, boolean findFirstIndex) {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        // binary search
        while (start <= end) {
            // find the mid element
            int mid = start + (end - start);

            // got the mid element - check
            if (arr[mid] < target) {
                // search in right
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                // initial ans found
                ans = mid;
                if(findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }

        return ans;
    }
}
