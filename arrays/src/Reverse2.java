import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] reversed = reverse(arr);

        System.out.println(Arrays.toString(reversed));
    }
    static int[] reverse(int[] arr) {
        int length = arr.length;
        // create a new array
        int[] reversed = new int[length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[length - 1 -i];
        }

        return reversed;
    }
}
