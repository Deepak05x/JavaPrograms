//QUESTION : Count the number of times a specific number appears in an integer.

import java.util.Scanner;

public class CountSpecific {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the long number : ");
        long number = input.nextLong();
        System.out.println("Enter a specific number : ");
        int specific = input.nextInt();
        int count = 0;
        while (number > 0) {
            if (number % 10 == specific) {
                count++;
            }
            number /= 10;
        }
        System.out.println(count + " times the specific number appears in the integer.");
        input.close();
    }
}