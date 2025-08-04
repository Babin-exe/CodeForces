// Problem link : https://codeforces.com/problemset/problem/2117/A

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- > 0) {
 
            int n = sc.nextInt();
            int x = sc.nextInt();
 
            int[] arr = new int[n];
            int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == 1) {
                    mini = Math.min(i, mini);
                    maxi = Math.max(i, maxi);
                }
            }
            if (maxi - mini + 1 <= x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
 
        }
        sc.close();
    }
}
