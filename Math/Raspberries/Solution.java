// Problem Link : https://codeforces.com/problemset/problem/1883/C


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
        long k = sc.nextLong();
        long even_count = 0;
        long ans = Long.MAX_VALUE;
        long[] a = new long[(int) n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] % 2 == 0) {
                even_count++;
            }
            if (a[i] % k == 0) {
                ans = 0;
            }
            ans = Math.min(ans, (k - a[i] % k));

        }

        if (k == 4) {
            if (even_count == 0) {
                ans = Math.min(ans, 2L);
            }
            if (even_count == 1) {
                ans = Math.min(ans, 1L);

            }
            if (even_count >= 2) {
                ans = Math.min(ans, 0L);
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
