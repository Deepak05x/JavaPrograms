//QUESTION : Write a program to reverse a number.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        int reveresedNumber = 0;
        while (number > 0) {
            int reminder = number % 10;
            reveresedNumber = (reveresedNumber * 10) + reminder;
            number /= 10;
        }
        System.out.println(reveresedNumber);
        input.close();
    }
}
