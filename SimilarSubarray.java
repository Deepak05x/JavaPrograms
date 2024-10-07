import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class SimilarSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            set.add(arr[i]);
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int i : set) {
            List<Integer> sub = new ArrayList<>();
            for (int j : arr) {
                if (j == i) {
                    sub.add(j);
                }
            }
            list.add(sub);
        }

        System.out.println(list);

    }
}
