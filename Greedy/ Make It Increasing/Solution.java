// Problem link : https://codeforces.com/problemset/problem/1675/B

import java.util.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] hehe = new long[n];
            for (int i = 0; i < n; i++)
                hehe[i] = sc.nextLong();

            int ans = 0;
            for (int i = n - 2; i >= 0; i--) {
                while (hehe[i] >= hehe[i + 1]) {
                    ans++;
                    hehe[i] /= 2;
                    if (hehe[i] == 0)
                        break;
                }
                if (hehe[i] == 0 && hehe[i + 1] == 0) {

                    ans = -1;
                    break;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
