package Patterns;

import java.util.Scanner;

public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        for(int i = 1; i<= rows; i++){
            for(int j = 1 ; j<= rows - i + 1 ; j++){
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
