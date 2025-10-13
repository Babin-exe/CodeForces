// Problem Link : https://codeforces.com/problemset/problem/1373/B


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
        String s = sc.next();
        int z = 0;
        int o = 0;
        for (char c : s.toCharArray()) {
            if (c == '0')
                z++;
            else
                o++;
        }
        int m = Math.min(z, o);
        if (m % 2 == 0)
            System.out.println("NET");
        else
            System.out.println("DA");

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
