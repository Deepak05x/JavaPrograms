import java.util.Scanner;

public class LongestTree{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int unit = input.nextInt();
        System.out.println("The Units :" + unit);
        int max = 0;
        for (int i = 1; i<=unit; i++){
            int ft,inch;
            System.out.println("Feet : ");
            ft = input.nextInt();
            System.out.println("inch : ");
            inch = input.nextInt();
            int result = (ft  * 12) + inch;
            if( max<result){
                max = result;
            }
        }
        System.out.println(max);
        
    }
}