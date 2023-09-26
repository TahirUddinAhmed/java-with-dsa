package Questions;

public class CeilingOfChar {
    public static void main(String[] args) {
        char[] chr = {'c', 'f', 'j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(chr, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // loop will run
            // find the mid value - because we are solving this using binary search
            int mid = start + (end - start) / 2;

            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // if there is no such character which is the smallest character greater then the target character - return the first character
        if(start == letters.length) {
            return letters[0];
        }

        // if while loop condition violated this statement will execute
//        return letters[start % letters.length];

        return letters[start];
    }
}

