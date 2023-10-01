package Questions;

public class SearchRotateArr {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6,7, 8, 0, 1, 2};
        int target = 0;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int arr[], int target) {
        int pivot = findPivot(arr);
        int firstHalf = binarySearch(arr, target, 0, pivot);
        if(firstHalf != -1) {
            return firstHalf;
        }

        return binarySearch(arr, target, pivot+ 1, arr.length - 1);
    }

    // arr = [4, 5, 6,7 0, 1, 2]
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the mid element
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // found pivot
                return mid;
            } else if(arr[start] >= arr[mid]) {
                // it means pivot doesn't lie on the right side, because elements are distinct
                // we need to search pivot on the left side
                end = mid - 1;
            } else if(arr[start] < arr[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                // fount the target element
                return mid;
            }
        }

        // if element not found - return -1
        return -1;
    }
}
