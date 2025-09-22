// Problem link : https://codeforces.com/problemset/problem/1855/B

import java.util.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n % 2 == 1) {
                System.out.println(1);
            } else {
                int ans = 1;
                for (int i = 2;; i++) {
                    if (n % i == 0)
                        ans++;
                    else
                        break;
                }
                System.out.println(ans);
            }

        }
        sc.close();
    }
}
