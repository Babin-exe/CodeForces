// Problem Link : https://codeforces.com/problemset/problem/1374/B

import java.io.*;
import java.util.*;

public class Main {

    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while (t-- > 0)
            solve();
        out.flush();
    }

    static void solve() {

        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        long a = 0, b = 0;
        while (n % 2 == 0) {
            n /= 2;
            a++;
        }
        while (n % 3 == 0) {
            n /= 3;
            b++;
        }

        if (a > b || n > 1) {
            System.out.println(-1);

        } else {
            System.out.println(2 * b - a);
        }

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
