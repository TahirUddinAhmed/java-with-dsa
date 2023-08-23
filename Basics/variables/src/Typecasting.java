
public class Typecasting {
    public static void main(String[] args) {

        // implicit type casting
        double d1 = 34; // store an integer value to a double
        float f1 = 20;
        long l1 = 12;

//        int i1 = 34.0; // not converting implicitly
        int i1 = (int) 34.56; // explicit conversion

        // expression
        double a = 3.14 * 42; // here 3.14 is double and 42 is an integer
        // first it will convert the 42 into double
        // then 42.0 will be added to 3.14 and the result is stored in variable a


        System.out.println(a);
    }
}
