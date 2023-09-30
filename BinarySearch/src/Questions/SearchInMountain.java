package Questions;
// Q: https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 1;
        int ans = searchInMountain(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            // need to find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if(arr[mid] > target) {
                    // 5, 4, 3, 2 , 1
                    // true - search in right
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    static int searchInMountain(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int tempEnd = arr.length - 1;

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

        int peak = start;
        int leftsearch = search(arr, target, 0, peak);


        if(leftsearch != -1) {
            return leftsearch;
        }

        int rightsearch = search(arr, target, peak, tempEnd);
        return rightsearch;
        // when the loop breaks start == end and pointing to the largest number

    }
}


