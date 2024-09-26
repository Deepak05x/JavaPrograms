public class SnakePrintPattern {
    public static void main(String args[]) {
        int n = 10;
        for (int i = 1; i <= n * 2; i += 4) {
            System.out.print(i + "\t");
            System.out.print(i + 1);
            System.out.println();
            System.out.print(i + 3 + "\t");
            System.out.print(i + 2);
            System.out.println();
        }
    }
}

// PRINTING THE VALUES IN SNAKE PATTERN LIKE
// 1 2
// 4 3
// 5 6
// 8 7
// AND SO ON.