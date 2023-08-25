package Assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Q: To find out whether the given String is Palindrome or not.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();
        String rev = "";


        for(int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        System.out.println(rev);
        // check condition
        if(word.equals(rev)) {
            System.out.println(word + " is Palidrome, because the word " + word + " reads same as backward and forward");
        } else {
            System.out.println(word + " is not pallidrome");
        }
    }
}
