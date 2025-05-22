//QUESTION : Simple switch case with new syntax

import java.util.Scanner;

class AnotherSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday"); // NOTE : case 1,2,3,4,5 -> System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
        input.close();
    }
}

class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        int empAge = input.nextInt();
        switch (empId) {
            case 1:
                System.out.println("Vivek");
                switch (empAge) {
                    case 25:
                        System.out.println("Age is 25");
                        break;
                    case 30:
                        System.out.println("Age is 30");
                        break;
                    default:
                        System.out.println("Age is not 25 or 30");
                }
                break;
            case 2:
                System.out.println("Rahul");
                switch (empAge) {
                    case 25:
                        System.out.println("Age is 25");
                        break;
                    case 30:
                        System.out.println("Age is 30");
                        break;
                    default:
                        System.out.println("Age is not 25 or 30");
                }
                break;
            default:
                System.out.println("Invalid emp id");
        }

        input.close();
    }
}

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        System.out.println("The fruit is " + fruit);
        switch (fruit) {
            case "Apple":
                System.out.println("The fruit is apple"); // NOTE : case "Apple" -> System.out.println("The fruit is
                                                          // apple");
                break;
            case "Mango":
                System.out.println("The fruit is mango");
                break;
            case "Orange":
                System.out.println("The fruit is orange");
                break;
            default:
                System.out.println("The fruit is not available");
        }
        input.close();
    }
}

// NOTE : Arrow in case statement supported from Java 14 onwards only
