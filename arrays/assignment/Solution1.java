public class Solution1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = addArray(numbers);
        System.out.println("Sum of all the elements are " + sum);
    }
    
    // function to add elements in an array
    static int addArray(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}