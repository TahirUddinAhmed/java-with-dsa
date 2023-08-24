public class Largest {
    public static void main(String[] args) {
        int a, b, c;


        a = 5;
        b = 7;
        c = 9;

        // find the largest of three numbers
//        int largest;
//        if(a > b && a > c) {
//            largest = a;
//        } else if (b > c) {
//            largest = b;
//        } else {
//            largest = c;
//        }

        // another way to
        int max = a;

        if(b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);


//        System.out.println("Largest number is : " + largest);
    }
}
