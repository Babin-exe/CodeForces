// Problem Link : https://codeforces.com/problemset/problem/1471/A
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            long n, x;
            n = sc.nextLong();
            x = sc.nextLong();
            long maxi = 0;
            long mini = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                maxi += (a + x - 1) / x;
                mini += a;
            }
            mini = (mini + x - 1) / x;
            System.out.println(mini + " " + maxi);
        }
        sc.close();
    }
}
