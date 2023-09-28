import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;
        //output: [0, 1]
        int[] ans = findSumTwo(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] findSumTwo(int[] nums, int target) {
        int sum = 0;
        if(nums.length == 0) {
            return new int[]{-1};
        }
        for(int i = 0; i < nums.length; i++) {
            int point = i; // point to ith index

            for(int n = i + 1; n < nums.length; n++) {
                sum = nums[point] + nums[n];

                if(sum == target) {
                    return new int[]{point, n};
                }
            }

        }
        return new int[]{-1};
    }

//    static int sum(int[] nums, int target)
}
