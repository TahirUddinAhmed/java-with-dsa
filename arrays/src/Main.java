public class Main {
    public static void main(String[] args) {
        // array
        // syntax:
        // datatype[] var_name = new datatype[size]

        // Q: Store 5 roll numbers
        int[] rno = new int[5];
        // or can directly declare, instantiate and initialize like
        int[] rno2 = {2, 12, 4, 32, 4};

        // declaration of arrays
        int[] marks;
        // initialization of arrays
        marks = new int[5]; // actually here object is being created in the heap memory
        // if we don't assign values in array it going to be zero
        // marks [0, 0, 0, 0, 0]
        System.out.println(marks[2]);

        // create an array which store string
        String[] arr = new String[4];
        // in case of string it store null if you don't store any value
        // arr [null, null, null, null]
        System.out.println(arr[1]);


    }
}