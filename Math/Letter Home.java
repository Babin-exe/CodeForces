// Problem link : https://codeforces.com/problemset/problem/2121/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int mini = 0;
            int maxi = 0;

            mini = (s - arr[0]);
            maxi = (s - arr[n - 1]);

            if (mini <= 0) {
                System.out.println(arr[n - 1] - s);
                continue;
            } else if (maxi >= 0) {
                System.out.println(s - arr[0]);
                continue;
            } else {
                int low = Math.abs(mini);
                int high = Math.abs(maxi);

                int take = (low > high) ? (2 * high + low) : (2 * low + high);
                System.out.println(take);
                continue;
            }

        }
        sc.close();
    }
}
