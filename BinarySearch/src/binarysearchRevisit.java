public class binarysearchRevisit {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 9, 11, 12, 14, 20, 30};
        int[] nums1 = {90, 75, 18, 12, 6, 4, 3, 1};
        int res = search(nums, 13);
        int res1 = agnosticBS(nums1, 12);

        int floor = floorArr(nums, 11);

        System.out.println(res);
        System.out.println(res1);
        System.out.println(floor);
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the mid element
            int mid = start + (end - start) / 2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int agnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // check if the array is sorted in ascending order or descending order
        boolean isAsc = arr[start] < arr[end];



        while(start <= end) {
           //find the middle value
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }


        }

        return -1;
    }


    public static int floorArr(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                // we got the target
                return mid;
            }
        }

        // if none of the statement return floor will be the end element
        return end;

    }
}
