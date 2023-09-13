import java.util.Arrays;
import java.util.Scanner;

public class ArrayofObj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] names = new String[5];
        System.out.print("Enter five people names: ");
        for(int i = 0; i < names.length; i++) {
            names[i] = in.next();
        }
        System.out.println(Arrays.toString(names));

        // Modify
        names[1] = "Minju";

        System.out.println(Arrays.toString(names));


    }
}
