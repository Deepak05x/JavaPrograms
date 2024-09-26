import java.util.Scanner;

public class MoveHyphen {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String value = input.next();
        String another = "";
        String hyphen = "";
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '-') {
                hyphen += "-";
            } else {
                another += value.charAt(i);
            }

        }
        System.out.println(hyphen + another);
    }
}
