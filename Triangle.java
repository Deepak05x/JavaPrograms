//QUESTION : Triangle Pattern

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        for(int i = 0 ; i<=rows ; i++){
            for(int j = i ; j< rows ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        input.close();
    }
}
