// Problem link : https://codeforces.com/problemset/problem/1766/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= 9; i++) {
                int val = i;
                while (val <= n) {
                    count++;
                    val *= 10;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
