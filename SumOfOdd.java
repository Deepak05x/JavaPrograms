import java.util.Scanner;

public class SumOfOdd {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int even = 0;
        int odd = 0;
        while (n != 0) {
            int last = n % 10;
            if (last % 2 == 0) {
                even = even + last;
            } else {
                odd = odd + last;
            }
            n = n / 10;
        }
        System.out.println(Math.max(even, odd));
    }
}