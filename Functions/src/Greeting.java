public class Greeting {
    public static void main(String[] args) {
        String message = greeting("How are you");
        System.out.println(message);
        String name = "Tahir";
        greet(name);
        System.out.println(name);
    }
    static String greeting(String msg) {
        return msg;
    }

    // in Java there is no call by reference - only call by value
    static void greet(String naam) {
        naam = "John";
        System.out.println(naam);
    }

}
