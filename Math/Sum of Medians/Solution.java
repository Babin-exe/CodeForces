// Problem Link :  https://codeforces.com/problemset/problem/1440/B
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
        long k = sc.nextLong();
        List<Long> vt = new ArrayList<>();
        for (int i = 0; i < n * k; i++)
            vt.add(sc.nextLong());

        long p = n * k;
        long ans = 0;

        while (k-- > 0) {
            p -= (n / 2 + 1);
            ans += vt.get((int) p); 
        }

        out.println(ans);
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
