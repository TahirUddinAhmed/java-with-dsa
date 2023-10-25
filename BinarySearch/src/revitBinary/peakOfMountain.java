package revitBinary;
// link : https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peakOfMountain {
    public static void main(String[] agrs) {
        //int[] arr = {1, 2, 3, 5, 6, 11, 4, 3, 2};
        int[] arr = {0, 1, 0};
        int ans = findPeak(arr);

        System.out.println(ans);
    }

    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // decreasing order
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                // increasing order
                start = mid + 1;
            }
        }

        return start;
    }
}
