// Problem Link : https://codeforces.com/contest/2162/problem/A

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
        long largest = 0;
        for (int i = 0; i < n; i++) {
            long val = sc.nextLong();
            if (val > largest) {
                largest = val;
            }
        }
        System.out.println(largest);

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
