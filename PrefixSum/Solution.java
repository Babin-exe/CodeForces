// Problem link: https://codeforces.com/problemset/problem/1807/D
import java.util.*;

public class Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            long[] ps = new long[n + 1];
            ps[0] = 0;
            // Prefix sum is built
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                ps[i] = ps[i - 1] + x;
            }
            long ans = ps[n];
            while (q-- > 0) {
                int l, r, k;
                l = sc.nextInt();
                r = sc.nextInt();
                k = sc.nextInt();
                long hehe = ps[r] - ps[l - 1];
                long auh = ans - hehe + 1L * (r - l + 1) * k;
                if (auh % 2 == 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");

            }

        }
        sc.close();
    }
}
