// Problem Link : https://codeforces.com/problemset/problem/1593/B
import java.util.*;

public class Main {

    public static int give(String n, String hehe) {
        int index = hehe.length() - 1;
        int ans = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            if (hehe.charAt(index) == n.charAt(i)) {
                index--;
                if (index < 0)
                    break;
            } else
                ans++;
        }

        if (index >= 0)
            return Integer.MAX_VALUE;

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int ans = Integer.MAX_VALUE;
            long x = sc.nextLong();
            String n = x + "";
            String[] hehe = { "00", "25", "50", "75" };
            for (int i = 0; i < 4; i++) {
                ans = Math.min(ans, give(n, hehe[i]));
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
