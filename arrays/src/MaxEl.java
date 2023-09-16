public class MaxEl {
    public static void main(String[] args) {
        int[] nums = {2, 7, 12, 7, 34, 9, 55};
        int maxEl = max(nums);
        System.out.println(maxEl);
    }
    static int max(int[] arr) {
        // assume max is the first element of the array
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
