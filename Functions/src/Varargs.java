import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(1, 3, 5, 23, 5, 87, 345, 1123, 4, 23, 0, 46);
    }

    static void fun(int ...nums) {
        System.out.println(Arrays.toString(nums));
    }
}
