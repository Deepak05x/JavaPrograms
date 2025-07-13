package Patterns;

import java.util.Scanner;

public class NumberIncreasingPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        for(int i = 1; i<=rows ; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
