// Problem link : https://codeforces.com/problemset/problem/1850/D
import java.util.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] take = new int[n];

            for (int i = 0; i < n; i++) {
                take[i] = sc.nextInt();
            }
            Arrays.sort(take);
            if (n == 1) {
                System.out.println(0);

            } else {

                int val = 1;
                int i = 0, j = 1;

                while (j < n) {
                    if (take[j] - take[j - 1] <= k) {
                        val = Math.max(val, j - i + 1);
                        j++;

                    } else {
                        i = j;
                        j++;

                    }
                }
                System.out.println(n - val);

            }
        }
        sc.close();
    }
}
