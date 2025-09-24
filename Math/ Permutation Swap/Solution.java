// Problem link: https://codeforces.com/problemset/problem/1828/B

import java.util.*;

public class Answer {

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long ans = 0, take;
            for (int i = 1; i <= n; i++) {
                take = sc.nextLong();
                ans = gcd(ans, Math.abs(take - i));
            }
            System.out.println(ans);

        }
        sc.close();
    }
}
