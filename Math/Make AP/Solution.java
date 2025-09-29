// Problem link : https://codeforces.com/problemset/problem/1624/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long a, b, c;
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
            if (a != 0 && (2 * b - c) > 0 && (2 * b - c) % a == 0) {

                System.out.println("YES");
                continue;
            } else if (b != 0 && (a + c) > 0 && (a + c) % (2 * b) == 0) {
                System.out.println("YES");
                continue;
            } else if (c != 0 && (2 * b - a) > 0 && (2 * b - a) % c == 0) {
                System.out.println("YES");
                continue;
            } else {

                System.out.println("NO");
            }
        }
        sc.close();
    }
}
