import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int size;
      System.out.print("Enter total numbers: ");
      size = in.nextInt();

      int[] numbers = new int[size];

      // take input 
      System.out.print("Enter all the numbers: ");
      for(int i = 0; i < numbers.length; i++) {
        numbers[i] = in.nextInt();
      }

      in.close(); // close the Scanner

      int big = largest(numbers);
      int small = smallest(numbers);
      System.out.println("Largest number is " + big);
      System.out.println("Smallest number is " + small);

    
    }

    // function to find the largest number of an array
    static int largest(int[] arr) {
        int large = 0; // let , first elements is large
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[large]) {
                large = i;
            }
        }
        return arr[large];
    }

    // function to find the smallest number 
    static int smallest(int[] arr) {
        int small = arr[0]; // let the first element is small
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < small) {
                small = arr[i];
            }
        }

        return small;
    }
}
