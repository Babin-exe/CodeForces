// Problem Link : https://codeforces.com/problemset/problem/1715/B

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
    long k = sc.nextLong();
    long b = sc.nextLong();
    long s = sc.nextLong();

    long minSum = k * b;
    long maxSum = minSum + (k - 1) * n;

    if (s < minSum || s > maxSum) {
        System.out.println("-1");
        return;
    }

    long[] ans = new long[(int)n];
    ans[0] = minSum;
    s -= minSum;

    for (int i = 0; i < n; i++) {
        long add = Math.min(k - 1, s);
        ans[i] += add;
        s -= add;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
        sb.append(ans[i]).append(" ");
    }
    System.out.println(sb);
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
