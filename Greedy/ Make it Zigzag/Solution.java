// Problem Link : https://codeforces.com/contest/2154/problem/B


import java.io.*;
import java.util.*;

public class Main {

    static FastScanner sc = new FastScanner(System.in);

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        long[] a = new long[(int) n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long maxi = a[0];
        long ans = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                a[i] = Math.max(a[i], maxi);
            }
            maxi = Math.max(maxi, a[i]);
        }

        for (int i = 0; i < n; i += 2) {
            long mini = Long.MAX_VALUE;

            if (i - 1 > 0) {
                mini = Math.min(mini, a[i - 1]);
            }

            if (i + 1 < n) {
                mini = Math.min(mini, a[i + 1]);
            }

            if (a[i] >= mini) {
                ans += (a[i] - mini + 1);
            }
        }
        System.out.println(ans);

    }

    static class FastScanner {

        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
