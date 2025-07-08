// Problem link : https://codeforces.com/problemset/problem/1788/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] take = new int[n];
            int twoCount = 0;

            for (int i = 0; i < n; i++) {
                take[i] = sc.nextInt();
                if (take[i] == 2) {
                    twoCount++;
                }
            }

            if (twoCount == 0) {
                System.out.println(1);
                continue;
            }

            if (twoCount % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            int half = twoCount / 2;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (take[i] == 2) {
                    count++;
                }

                if (count == half) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
