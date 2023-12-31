package Questions;

public class CeilingOfNum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 12, 13, 16, 18};
        int target = 25;
        int ans = arrCeil(nums, target);
        System.out.println(ans);
    }

    // return the index value
    // find the smallest element which is greater then or equal to target
    static int arrCeil(int[] arr, int target) {
        // if the target element > then the largest element - return -1
        if(target > arr[arr.length -1]) {
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;
            boolean isAsc = arr[s] < arr[e];

            while (s <= e) {
                int mid = s + (e - s) / 2;

                if (target == arr[mid]) {
                    return mid;
                }

                if (isAsc) {
                    if (target > arr[mid]) {
                        // lies in the right section
                        s = mid + 1;
                    } else {
                        e = mid - 1;
                    }
                } else {
                    // sorted in descending order
                    if (target > arr[mid]) {
                        // lies in the left section
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                }

            }

            return s; // if while loop condition break return the start element
    }
}
