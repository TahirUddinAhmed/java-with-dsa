public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-11, -7, -3, 0, 2, 3, 4, 6, 12, 23, 34, 45, 67, 78, 89}; // ascending order
        int[] arr2 = {77, 56, 45, 34, 23, 8, 3, 1, -12}; // descending order
        int target = -7;
        int target2 = 3;
        int ans = binarySearch(arr, target);
        int ans2 = binarySearchDes(arr2, target2);
        System.out.println(ans);
        System.out.println(ans2);
    }
    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            // find the mid value
            //int mid = (start + end) / 2; // this may exceeds the range of int
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid -1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }

        }

        return -1;
    }

    // binary search for descending order
    static int binarySearchDes(int[] arr, int target) {
        int s = 0;
        int e = arr.length -1;

        while(s <= e) {
            int mid = s + (e - s)/2;

            if(target > arr[mid]) {
                // search in left
                e = mid -1;
            } else if(target < arr[mid]) {
                s = mid + 1;
            } else {
                // result found
                return mid;
            }
        }

        return -1;
    }


}

