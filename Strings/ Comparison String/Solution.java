// Problem link : https://codeforces.com/contest/1837/problem/B
  import java.util.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 1, hehe = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i - 1) == s.charAt(i)) {
                    hehe++;
                } else {
                    ans = Math.max(hehe, ans);
                    hehe = 1;
                }

            }
            ans = Math.max(hehe, ans);
            System.out.println(ans + 1);

        }
        sc.close();
    }
}
