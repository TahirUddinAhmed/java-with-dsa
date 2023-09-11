public class Maximum {
    public static void main(String[] args) {
        // Q: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        int a = 5;
        int b = 7;
        int c = 3;
        System.out.println("Maximum value is: " + max(a, b, c));
        System.out.println("Minimum Value is: " + min(a, b, c));

    }
    static int max(int a, int b, int c) {
        int big;
        if(a > b && a > c) {
            big = a;
        } else if(b > c) {
            big = b;
        } else {
            big =c;
        }

        return big;
    }

    static int min(int a, int b, int c) {
        int small;
        if(a < b && a < c) {
            small = a;
        } else if(b < c) {
            small = b;
        } else {
            small = c;
        }

        return small;
    }
}
