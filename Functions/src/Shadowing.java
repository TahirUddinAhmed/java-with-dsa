public class Shadowing {
    static int x = 90; // this will be shadowed at line no 6
    static int y = 100;
    public static void main(String[] args) {
        System.out.println("From inside main value of x : " + x);
        int x = 40;

        int y;
       // System.out.println(y);

        y = 50;
        System.out.println("Value of x is :" + x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
