public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 12, 14, 8, 43, 99, 72};
        System.out.println(linearSearch(numbers, 14));


        System.out.println(ModifiedLSearch(numbers, 13));

        System.out.println(linearSeach2(numbers, 71));
    }
    // linear search - return the index if item found
    // otherwise - return -1 if it is not found
    static int linearSearch(int[] arr, int target) {
        int found = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                found = i;
                break;
            } else {
                found = -1;
            }
        }

        return found;
    }

    // linear search - return true if element found and return false if element not found
    static boolean linearSeach2(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }
        for(int elements: arr) {
            if(elements == target) {
                return true;
            }
        }
        // if none of the return statement is executed - return false
        return false;
    }

    // modified linearsearch function
    static int ModifiedLSearch(int[] arr, int target) {
        // check if arr is empty
        if(arr.length == 0) {
            return -1;
        }

        // search
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        // if none the statement is execute the line will run
        return -1;
    }

}