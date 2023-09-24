public class OrderAgnosticBS {
    public static void main(String[] args) {
        // initialize an array
        int[] arr = {99, 92, 87, 79, 67, 56, 45, 34, 2, 1, 0, -4}; // descending order
        int[] arr2 = {2, 5, 9, 12, 14, 22, 31, 44, 54, 67, 87, 90}; // ascending order
        int target = 0;
        int ans = orderAgnosticBS(arr, target);
        int ans2 = orderAgnosticBS(arr2, 9);
        System.out.println(ans);
        System.out.println(ans2);
    }
    // order agnostic binary search
    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        // check whether the array is sorted in ascending or descending order
        boolean isAsc;
        if(arr[s] < arr[e]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while(s <= e) {
            int mid = s + (e - s) / 2;

            if(target == arr[mid]) {
                return mid;
            }
            if(isAsc) {
                if(target > arr[mid]) {
                    // element lies in right side
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                // sorted in descending order
                if(target > arr[mid]) {
                    // element lies in left side
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }

        return -1;
    }
}
