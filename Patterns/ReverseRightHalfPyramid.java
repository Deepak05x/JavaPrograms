package Patterns;

import java.util.Scanner;

class ReverseRightHalfPyramid{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        int x = 5;
        for(int i = 1 ; i<=x ; i++){
            for(int j = i ; j<=x ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();

    }
}  