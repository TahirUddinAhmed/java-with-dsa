import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(1, 3, 5, 23, 5, 87, 345, 1123, 4, 23, 0, 46);
        example(12, 3, "Tahir", "John", "Peter");
    }

    static void fun(int ...nums) {
        System.out.println(Arrays.toString(nums));
    }
    static void example(int a, int b, String ...str) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(str));
    }
}
