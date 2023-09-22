import java.util.Arrays;

public class SumTwo {
    public static void main(String[] args) {
        // Q: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        int[] arr = {2,7,11,15};
        int target = 18;

        int[] ans = twoSum(arr, target);

        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] nums, int target) {
        if(nums.length == 0) {
            return new int[]{-1};
        }
        for(int i = 0; i < nums.length; i++) {
            int first = i;
            int second = first + 1;
            int sum = nums[first] + nums[second];
            if(sum == target) {
                return new int[]{first, second};
            }
        }

        return new int[]{-1};
    }

}
