// Problem Link : https://codeforces.com/problemset/problem/1543/A
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }
            if (a == b) {
                System.out.println(0 + " " + 0);
                continue;
            }
            long g = Math.abs(a - b);
            long mod = b % g;
            System.out.println(g + " " + Math.min(mod, g - mod));

        }
        sc.close();
    }
}
