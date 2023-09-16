import java.util.ArrayList;

public class MuliAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> muliArrList = new ArrayList<ArrayList<Integer>>();

        // create inner ArrayList and add them to the outer ArrayList
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(6);
        row3.add(7);
        row3.add(8);

        muliArrList.add(row1);
        muliArrList.add(row2);
        muliArrList.add(row3);

        System.out.println(muliArrList);


    }
}
