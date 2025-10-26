// Problem Link : https://codeforces.com/problemset/problem/1840/C

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
        long n, k, q;
        n = sc.nextLong();
        k = sc.nextLong();
        q = sc.nextLong();

        long[] arr = new long[(int) n];

        for (int i = 0; i < n; i++) {
            long take = sc.nextLong();
            if (take <= q) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        long one_count = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                one_count++;
            } else {

                if (one_count >= k) {
                    long val = one_count - k + 1;
                    ans += (val * (val + 1) / 2);
                }

                one_count = 0;
            }
        }

        if (one_count >= k) {
            long val = one_count - k + 1;
            ans += (val * (val + 1) / 2);

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
