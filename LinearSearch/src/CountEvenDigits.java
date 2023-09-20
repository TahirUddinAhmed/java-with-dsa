public class CountEvenDigits {
    public static void main(String[] args) {
        // Q: Given an array nums of integers, return how many of them contain an even number of digits.
        //[12,345,2,6,7896]
        int[] nums = {12, 345, 2, 66, 7896};

        int countevent = countEvenDigit(nums);

        System.out.println(countevent);
    }

    static int countEvenDigit(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        if (digits(num) % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}




