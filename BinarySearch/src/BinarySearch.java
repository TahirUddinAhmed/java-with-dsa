public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-11, -7, -3, 0, 2, 3, 4, 6, 12, 23, 34, 45, 67, 78, 89};
        int target = -7;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            // find the mid value
            //int mid = (start + end) / 2; // this may exceeds the range of int
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid -1;
            } else {
                // ans found
                return mid;
            }

        }

        return -1;
    }
}