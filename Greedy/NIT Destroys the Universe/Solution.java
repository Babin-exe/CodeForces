// Problem link : https://codeforces.com/problemset/problem/1696/B
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int ans = 0;
            int n = sc.nextInt();
            int[] hehe = new int[n];
            for (int i = 0; i < n; i++) {
                hehe[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (hehe[i] == 0)
                    continue;
                ans++;
                while (i < n && hehe[i] != 0)
                    i++;

            }
            System.out.println(Math.min(2, ans));
        }
    }
}
