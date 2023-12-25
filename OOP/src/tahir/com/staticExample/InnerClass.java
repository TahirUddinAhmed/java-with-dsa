package tahir.com.staticExample;


public class InnerClass {
    static class Test {
        String name;
        Test (String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Tahir");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//static class A {
//
//}
