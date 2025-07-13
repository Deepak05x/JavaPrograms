package Patterns;

import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();;
        for(int i=x;i>=0;i--){
            for(int j=x-1;j>=x-i;j-- ){
                System.out.print("   ");
            }
            for(int j=x-i;j>=0;j--){
                 System.out.print(" * ");
            }
            System.out.println();
        }
        input.close();
    }
}

   