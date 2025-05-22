//QUESTION : Create a Basic Calculator

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.print("Enter the operator : ");
            char operator = input.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter two numbers : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (operator == '+') {
                    ans = num1 + num2;
                } else if (operator == '-') {
                    ans = num1 - num2;
                } else if (operator == '*') {
                    ans = num1 * num2;
                } else if (operator == '/') {
                    ans = num1 / num2;
                } else if (operator == '%') {
                    ans = num1 % num2;
                }
            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }
        input.close();

    }
}
