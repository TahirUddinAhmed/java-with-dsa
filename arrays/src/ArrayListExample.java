import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // create & initialized arraylist
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // add Elements - to the ArrayList
        nums.add(16);
        nums.add(4);
        nums.add(91);

        // access elements
        int firstNum = nums.get(0); // get the first number of the ArrayList

        // Modify Elements - using set() method
        nums.set(1, 2);

        // Remove Elements - using remove() method
        nums.remove(0);

        // getting the size of the ArrayList
        int size = nums.size();
        System.out.println("The size of the ArrayList is " + size);
//        System.out.println(nums);
        // print using for loop
        for(int n: nums) {
            System.out.print(n + ", ");
        }
    }
}
