package Questions;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] numbers = {3, 11, 71, 8, 44, 9, 144, 7};
        int big = largest(numbers);
        int small = smallest(numbers);

        // print the array elements
        System.out.print("Array : ");
        for(int val: numbers) {
            System.out.print(val + " ");
        }
        System.out.println(); // new line
        System.out.println("Largest value of the array is " + big);
        System.out.println("Smallest value of the array is " + small);

    }

    static int largest(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[largest]) {
                largest = i;
            }
        }

        return arr[largest];
    }

    static int smallest(int[] arr) {
        int small = 0; // let the first element would be smallest
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[small]) {
                small = i;
            }
        }

        return arr[small];
    }
}
