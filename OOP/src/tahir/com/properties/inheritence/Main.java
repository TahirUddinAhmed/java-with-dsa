package tahir.com.properties.inheritence;

public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        Box cube = new Box(6);
        Box b2 = new Box(12, 6, 8);
        Box b3 = new Box(cube);

        BoxWeight b4 = new BoxWeight();
        BoxWeight b5 = new BoxWeight(4, 3, 7, 12);

//        b4.show();
//        b5.show();
//        System.out.println("weight: " + b5.weight);


        Box b6 = new BoxWeight(2, 5, 7, 10);

        b6.show();
//        System.out.println(b6.weight);

//        b.show();
//        cube.show();
//        b2.show();
//        b3.show();
    }
}
