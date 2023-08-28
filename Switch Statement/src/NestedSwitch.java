import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        // nested switch statement
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee id and department name: ");
        int empID = in.nextInt();
        String dept = in.next();


        switch (empID) {
            case 1:
                System.out.println("Tahir Uddin Ahmed");
                break;
            case 2:
                System.out.println("Ayan Khan");
                break;
            case 3:
                System.out.println("Employee id- 3");
                switch (dept) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Please enter a correct employee id");
        }


    }
}
