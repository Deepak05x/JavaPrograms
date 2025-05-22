//QUESTION : Write a program to print the Fibonacci series up to a given number n.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("The number is : ");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        input.close();
    }
}

// NOTE :
// Here while loop can also be used for imporving the readability of the code