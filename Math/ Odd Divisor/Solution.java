// Problem Link : https://codeforces.com/problemset/problem/1475/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            long n = sc.nextLong();
            if (n > 0 && (n & (n - 1)) == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        sc.close();
    }
}
