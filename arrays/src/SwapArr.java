import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 4, 3};
        System.out.println("Before swap: " + Arrays.toString(nums));
        swap(nums, 2, 4);

        System.out.println("After swap: " + Arrays.toString(nums));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
