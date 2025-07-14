package Patterns;

import java.util.Scanner;

public class NumberChasingPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int count = 1;
        for(int i = 1; i<= rows; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(count + " ");
                count++;
            }

            System.out.println();
        }
    }
}
