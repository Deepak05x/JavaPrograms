import java.util.Scanner;

public class Subsequence {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String x = Integer.toString(input.nextInt());
        int count = 0;
        for (int l = 0; l < x.length(); l++) {
            for (int r = l; r < x.length(); r++) {
                if (Integer.parseInt(x.substring(l, r + 1)) % 11 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

// THE PROGRAM IS : THERE WILL BE A GIVEN INTEGER : 1215589. SO THE NUMBER
// SHOULD BE SUBSEQUENCED LIKE
// 1, 12, 121, 1215, 12155 ...
// AND THEN IT SHOULD START FROM
// 2, 21, 215...
// THEN START FROM THE NEXT INDEX OF THE GIVEN INTEGER
// THE OUTPUT IS : 4 , CAUSE IT SHOULD PRINT THE COUNT OF THE VALUES DIVIDED BY
// 11.