package Patterns;

import java.util.Scanner;

public class K_Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        K_Pattern pattern = new K_Pattern();
        pattern.upperPart(rows);
        pattern.lowerPart(rows);
    }

    public void lowerPart(int rows){
        for(int i = 1 ; i<= rows; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void upperPart(int rows){
        for(int i = 1 ; i<= rows ; i++){
            for(int j = rows - i ; j>=0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
