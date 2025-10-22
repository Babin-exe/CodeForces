// Problem Link : https://codeforces.com/problemset/problem/1859/B

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
        long ans = 0;
        long fisrt_min = Long.MAX_VALUE;
        long second_min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long m = sc.nextLong();
            long[] take = new long[(int) m];
            for (int a = 0; a < m; a++) {
                take[a] = sc.nextLong();
            }
            Arrays.sort(take);
            fisrt_min = Math.min(take[0], fisrt_min);
            second_min = Math.min(second_min, take[1]);
            ans += take[1];
        }
        System.out.println(ans - second_min + fisrt_min);

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

