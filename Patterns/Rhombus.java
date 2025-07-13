package Patterns;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for(int i = 1 ; i <= x ; i++ ){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("   ");
            }
            for(int j = x ; j>=0 ; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        input.close();
    }
}
