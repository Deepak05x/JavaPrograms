import java.util.Scanner;

public class WaterMelon {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x >= 4) {
            if (x % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

// THE QUESTION IS, IF THE NUMBER CONTAINS EVEN PAIRS WHEN WE SPLIT THE NUMBER
// LIKE FOR 10 WE WILL HAVE 4,6 . IF THAT IS THE CASE PRINT YES , IF NOT THE
// CASE PRINT NO
