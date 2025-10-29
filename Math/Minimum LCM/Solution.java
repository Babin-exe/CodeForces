// Problem Link : https://codeforces.com/problemset/problem/1765/M


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

        if (n % 2 == 0) {

            System.out.println(n / 2 + " " + n / 2);
            return;

        } else {

            long a = 1;
            long b = n - 1;
            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {
                    a = n / i;
                    b = n - a;
                    break;
                }
            }

            System.out.println(a + " " + b);
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
