// Problem Link : https://codeforces.com/problemset/problem/1849/B


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
        List<long[]> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long val = x % k;
            if (val == 0) {
                val = k;
            }
            v.add(new long[]{val, i + 1});
        }
        v.sort((a, b) -> {

            if (a[0] == b[0]) {
                return Long.compare(a[1], b[1]);
            }
            return Long.compare(b[0], a[0]);
        });

        for (long[] arr : v) {
            System.out.print(arr[1] + " ");
        }
        System.out.println();
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
