import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 41, 51, 34, 5};
        change(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums) {
        nums[0] = 77; // if you make a change via ref variable, same object will be changed

    }
}
