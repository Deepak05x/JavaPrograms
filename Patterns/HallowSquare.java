package Patterns;

import java.util.Scanner;

public class HallowSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        for(int i = 1 ; i<= rows ; i++){
            for(int j = rows ; j> 0 ; j--){
                if(j == 1 || i == 1 ||  i == rows || j == rows){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}
