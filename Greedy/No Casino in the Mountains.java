// problem link : https://codeforces.com/problemset/problem/2126/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int i = 0;
            int sub = 0;
            int count = 0;

            while (i < n) {
                if (nums[i] == 0) {
                    count++;
                } else {
                    count = 0;
                }

                if (count == k) {
                    sub++;
                    i++;
                    count = 0;
                }
                i++;

            }
            System.out.println(sub);
        }
        sc.close();
    }
}




