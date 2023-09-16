import java.util.ArrayList;
import java.util.Scanner;

public class MulAL2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mulArr = new ArrayList<ArrayList<Integer>>();

        // initialisation of inner ArrList
        for (int i = 0; i < 3; i++) {
            mulArr.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mulArr.get(i).add(in.nextInt());
            }
        }

        System.out.println(mulArr);


    }
}
