// Problem Link : https://codeforces.com/problemset/problem/1831/B

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

        long[] b = new long[(int) n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        long[] aa = new long[(int) (n * 2) + 1];
        long[] bb = new long[(int) (n * 2) + 1];

        long count = 1;
        for (int i = 1; i < n; i++) {

            if (a[i] == a[i - 1]) {
                count++;
            } else {
                aa[(int) a[i - 1]] = Math.max(aa[(int) a[i - 1]], count);
                count = 1;
            }
        }
        aa[(int) a[(int) n - 1]] = Math.max(aa[(int) a[(int) n - 1]], count);

        count = 1;

        for (int i = 1; i < n; i++) {
            if (b[i] == b[i - 1]) {
                count++;
            } else {
                bb[(int) b[i - 1]] = Math.max(bb[(int) b[i - 1]], count);
                count = 1;
            }
        }
        bb[(int) b[(int) n - 1]] = Math.max(bb[(int) b[(int) n - 1]], count);

        long ans = 0;
        for (int i = 0; i < 2 * n + 1; i++) {
            ans = Math.max(ans, bb[i] + aa[i]);
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
