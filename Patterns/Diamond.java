package Patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        Diamond obj1 = new Diamond();
        obj1.upperTriangle(x);
        obj1.lowerTriangle(x);

    }

    public void upperTriangle(int x){
        for(int i = 1 ; i<= x ; i++){
            for(int s = 1 ; s<=x - i ; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void lowerTriangle(int x){
        for(int i = x; i>= 0; i--){
            for(int k = 0 ; k < x - i ; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
