// Problem link : https://codeforces.com/problemset/problem/2120/A


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int l1 = sc.nextInt();
            int b1 = sc.nextInt();
            int l2 = sc.nextInt();
            int b2 = sc.nextInt();
            int l3 = sc.nextInt();
            int b3 = sc.nextInt();

            int area = (l3 * b3) + (l2 * b2) + (l1 * b1);
            int side = (int) Math.sqrt(area);

            if (Math.sqrt(area) != side) {
                System.out.println("NO");
                continue;
            }

            boolean ans = false;

            if (b1 == side && b2 + b3 == side && l2 == l3 && l1 + l2 == side) {
                ans = true;
            } else if (l1 == side && l2 + l3 == side && b2 == b3 && b1 + b2 == side) {
                ans = true;
            }

            else if ((l1 == side && l2 == side && l3 == side) && ((b1 + b2 + b3) == side)) {
                ans = true;
            } else if ((b1 == side && b2 == side && b3 == side) && ((l1 + l2 + l3) == side)) {
                ans = true;
            }

            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
