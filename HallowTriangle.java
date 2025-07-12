import java.util.Scanner;

class HallowTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        input.close();
    }
}
