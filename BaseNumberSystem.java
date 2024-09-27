public class BaseNumberSystem {
    public static void main(String args[]) {
        int x = 12;
        int count = 0;
        for (int i = 2; i <= x; i++) {
            int result = 0;
            int num = x;

            int parity = 1;
            while (num != 0) {
                int modulas = num % i;
                result += modulas * parity;
                num /= i;
                parity *= 10;

            }
            if (result % 10 == 0) {
                count++;

            }

        }
        System.out.println(count);

    }
}

// THERE WILL BE A INPUT EG.12, THE 12 WILL BE CONVERTED TO DECIMAL USING BASE
// VALUE FROM 2 TO 12. AND PRINT THE COUNT FOR HOW MNAY MANY TIMES THE LAST
// VALUE OF THE DECIMAL CONVERSION HAS ZERO