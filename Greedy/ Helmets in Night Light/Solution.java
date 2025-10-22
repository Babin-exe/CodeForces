// Problem Link : https://codeforces.com/problemset/problem/1876/A

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
        long n, p;
        n = sc.nextLong();
        p = sc.nextLong();
        long[] a = new long[(int) n];
        long[] b = new long[(int) n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        long[][] v = new long[(int) n][2];

        for (int i = 0; i < n; i++) {
            v[i][0] = b[i];
            v[i][1] = a[i];
        }

        Arrays.sort(v, (x, y) -> Long.compare(x[0], y[0]));

        long cost = p;
        long person = 1;
        for (int i = 0; i < n; i++) {
            long take_cost = v[i][0];
            long take_person = v[i][1];
            if (take_cost >= p) {
                break;
            }

            if (take_person + person > n) {
                cost += (n - person) * take_cost;
                person = n;
                break;
            } else {
                cost += take_person * take_cost;
                person += take_person;
            }

        }
        cost += (n - person) * p;
        System.out.println(cost);
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
