public class SearchInString {
    public static void main(String[] args) {
        String name = "Tahir";
        char target = 'e';
        boolean ans = search(name, target);

        System.out.println(ans);
    }

    // search characters in a string
    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }

        return false;
    }
}
