package Patterns;

import java.util.Scanner;

public class NumberChasingPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        for(int i = 0; i< rows; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(j + i);
            }
            System.out.println();
        }
    }
}
