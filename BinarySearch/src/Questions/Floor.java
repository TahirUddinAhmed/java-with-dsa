package Questions;

public class Floor {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 12, 13, 16, 18};
        int target = 1;
        int ans = arrFloor(nums, target);
        System.out.println(ans);
    }

    // return the index value
    static int arrFloor(int[] arr, int target) {

        if(target < arr[0]) {
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

            return e; // if while loop condition break return the start element
    }
}
