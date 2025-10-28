// Problem Link : https://codeforces.com/problemset/problem/1791/D

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
        String s = sc.next();

        long ans = 0;
        int[] prefix = new int[(int) n];
        int[] suffix = new int[(int) n];
        Set<Character> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(s.charAt(i));
            prefix[i] = st.size();
        }
        st.clear();

        for (int i = (int) n - 1; i >= 0; i--) {
            st.add(s.charAt(i));
            suffix[i] = st.size();

        }

        for (int i = 0; i < n-1; i++) {
            ans = Math.max(ans, prefix[i] + suffix[i + 1]);
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
