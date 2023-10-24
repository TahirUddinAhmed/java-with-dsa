package revitBinary;

public class searchInfinite {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26};
        int target = 24;
        int ans = findRange(arr, target);
        System.out.println(ans);
    }

//    We need to search in an infinite array
//    which means we don't know to size of the array
//    because it is a sorted array so I am going to use binary search
//    problem: how to find the size,
//    what will be the end point ?

    public static int findRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(arr[end] < target) {
            start = end;
            end = end + (end - start + 1) * 2;
        }

        return search(arr, target, start, end);
    }

    public static int search(int[] arr, int target, int start, int end) {
        while(start <= end) {
//            find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
//                we got the answer
                return mid;
            }
        }

        return -1;
    }



}
