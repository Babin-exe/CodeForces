// Problem link : https://codeforces.com/contest/1875/problem/A

import java.util.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a, b;
            int n;
            a = sc.nextLong();
            b = sc.nextLong();
            n = sc.nextInt();
            long ans = b;
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                if (1 + x <= a) {
                    ans += x;
                } else {
                    ans += a - 1;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
