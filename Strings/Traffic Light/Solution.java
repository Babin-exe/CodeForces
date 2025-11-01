// Problem Link : https://codeforces.com/problemset/problem/1744/C


import java.io.*;
import java.util.*;

public class Main {

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    static FastScanner sc = new FastScanner(System.in);

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        char ch = sc.next().charAt(0);
        String s = sc.next();
        s += s;
        n *= 2;
        long g = -1;
        long ans = Long.MIN_VALUE;

        for (int i = (int) n - 1; i >= 0; i--) {

            if (s.charAt(i) == 'g') {
                g = i;
            }
            if (s.charAt(i) == ch) {
                long diff = g - i;
                ans = Math.max(ans, diff);
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
