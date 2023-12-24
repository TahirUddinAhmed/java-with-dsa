package tahir;

public class greeting {
    public static void main(String[] args) {

        System.out.println("Hello, there how are you?");

        car toyota = new car("Toyota",4, 4, 1050000);

        System.out.println(toyota.name);
        toyota.start();
    }
}

class car {
    double price;
    int seat;
    String name;
    int weels;

    car (String name, int seat, int weels, double price) {
        this.name = name;
        this.seat = seat;
        this.weels = weels;
        this.price = price;
    }

    void start() {
        System.out.println("Start Engine:)");
    }


}
