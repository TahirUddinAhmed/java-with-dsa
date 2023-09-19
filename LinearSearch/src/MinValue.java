public class MinValue {
    public static void main(String[] args) {
        // Q: Find the minimum number in the array
        int[] nums = {12, 4, 29, 13, 2, 5};

        System.out.println(minValue(nums));

    }
    // min - return the min number
    // assume array in != 0
    static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element < min) {
                min = element;
            }
        }

        return min;
    }
}
