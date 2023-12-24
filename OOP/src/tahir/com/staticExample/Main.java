package tahir.com.staticExample;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tahir", 20, 450000, "Google", false);
        Employee e2 = new Employee("Rahul", 35, 10000, "Nesso Academy", true);

        System.out.println(e1.name);
        System.out.println(Employee.founder);
        System.out.println(Employee.founder);

//        greeting();
    }

    // this is not dependent on objects
    static void fun() {
//        greeting(); // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you can't access non-static stuff without referencing their instances in a static context
        Main obj = new Main();

        // hence, here i am referencing it
        obj.greeting();
    }

    // we know that something which is not static, belongs to an object
     void greeting() {
//        fun();
        System.out.println("Hello coders");
    }
}
