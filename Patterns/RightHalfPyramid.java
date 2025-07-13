package Patterns;

import java.util.Scanner;

public class RightHalfPyramid{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your input");
    int x = input.nextInt();
    for(int i = 1 ; i<=x ; i++){
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    input.close();
}
}
