package Patterns;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        for(int i = 1 ; i<=rows ; i++){
            for(int  k = 0 ; k< rows - i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<= i; j++){
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
