// Problem link : https://codeforces.com/contest/1878/problem/C
import java.util.*;

public class Answer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n, k, x;
            n = sc.nextLong();
            k = sc.nextLong();
            x = sc.nextLong();
            long left_sum = k * (k + 1) / 2;
            long right_sum = n * (n + 1) / 2 - (n - k) * (n - k + 1) / 2;
            if (left_sum <= x && x <= right_sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
