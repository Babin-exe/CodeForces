// Problem link : https://codeforces.com/problemset/problem/1726/A
import java.util.*;

public class Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int ans = 0;
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, arr[i] - arr[0]);
            }
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, arr[n - 1] - arr[i]);
            }
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, arr[i] - arr[i + 1]);
            }
            System.out.println(ans);

        }
        sc.close();
    }
}
