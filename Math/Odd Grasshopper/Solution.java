// Problem link : https://codeforces.com/problemset/problem/1607/B
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long x, n;
            x = sc.nextLong();
            n = sc.nextLong();
            long ans = 0;
            if (n % 4 == 1)
                ans = -n;
            else if (n % 4 == 2)
                ans = 1;
            else if (n % 4 == 3)
                ans = n + 1;
            else if (n % 4 == 0)
                ans = 0;

            if (x % 2 == 0)
                ans = x + ans;
            else
                ans = x - ans;
            System.out.println(ans);
        }
        sc.close();
    }
}
