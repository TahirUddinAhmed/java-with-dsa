import java.util.Arrays;

public class PassingArr {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        // call the modifyArr function
        modifyArr(numbers);
        System.out.println(Arrays.toString(numbers));


        // NOTE: Always remember when we pass an array to a function,
        // we are passing the reference of the original array, means that any change made to the functions array effect the original one.
        
    }
    static void modifyArr(int[] arr) {
        arr[0] = 101;
    }
}
