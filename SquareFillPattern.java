import java.util.Scanner;

public class SquareFillPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for(int i = 0; i<x; i++ ){
            for(int j = 0; j<x; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        input.close();
    }
}
