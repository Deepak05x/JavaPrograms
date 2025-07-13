package Patterns;

import java.util.Scanner;

public class FullDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        FullDiamond tri = new FullDiamond();
        tri.upperTriangle(rows);
        tri.lowerTriangle(rows);
    }

    public void upperTriangle(int rows){
        for(int i = 1; i<= rows; i++){
            for(int k = 1 ; k <= rows - i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<= i ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void lowerTriangle(int rows){
        for(int i = rows ; i>= 0 ; i--){
            for(int k = 0 ; k <= rows - i ; k++){
                System.out.print(" ");
            }
            for(int j = i - 2 ; j>= 0 ; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
