public class Scope {
    public static void main(String[] args) {
        int a = 20;
        {
//            int a = 34; // already initialized outside the block in the same method, hence you can't initialize again
            System.out.println(a);
            int c = 30;
            // values initialized in this block will remain in this block
        }
//        System.out.println(c); // can't access block level element outside the block


        // scoping in for loop
        for(int i = 0; i <5; i++) {

        }
//        System.out.println(i); // can't access
    }

    static void fn() {
//        System.out.println(a); // can't access the variable a because it is not initialized in this block scope
    }
}
