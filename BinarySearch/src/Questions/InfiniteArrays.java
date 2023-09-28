package Questions;

public class InfiniteArrays {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8,  10, 11 , 12, 15, 19, 24, 29, 34};
        int target = 19;
        int result = ans(arr, target);
        System.out.println(result);
    }
    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            end = end + (end - start + 1) * 2;

            start = newStart;
        }

        // if the loop break this statement will execute
        int ans = search(arr, target, start, end);

        return ans;
    }

    static int search(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle value
            int mid = start + (end - start) / 2;

            if(arr[mid] < target) {
                // element lies in the right side
                start = mid + 1;
            } else if(arr[mid] > target){
                end = mid -1;
            } else {
                // and found
                return mid;
            }
        }

        return -1;
    }
}
