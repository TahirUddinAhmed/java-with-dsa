package Questions;

public class MountainArr {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};
        int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            // find the mid value
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // decreasing order
                // this may be your ans but look at the left
                end = mid;
            } else {
                // increasing order
                start = mid + 1;
            }
        }


        // when the loop breaks start == end and pointing to the largest number
        return start;
    }
}
