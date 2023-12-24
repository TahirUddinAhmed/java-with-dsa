package tahir.com.staticExample;

public class Employee {
    String name;
    int age;
    double salary;
    String companyName;
    boolean isMarried;
    static String founder;

    static void message() {
        System.out.println("Hello there");
//        System.out.println(this.age);
        // can't use this over here
    }

    Employee(String name, int age, double salary, String companyName, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.companyName = companyName;
        this.isMarried = isMarried;
        Employee.founder = "Larry Page And Sergey Brin";

        Employee.message();
    }
}
