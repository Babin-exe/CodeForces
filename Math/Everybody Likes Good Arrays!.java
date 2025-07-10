// Problem Link : https://codeforces.com/problemset/problem/1777/A



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] take = new int[n];
            int even = 0;
            int odd = 0;

            for (int i = 0; i < n; i++) {
                take[i] = sc.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                if (take[i] % 2 == 0 && take[i + 1] % 2 == 0) {
                    even++;
                } else if (take[i] % 2 != 0 && take[i + 1] % 2 != 0) {
                    odd++;
                }
            }
            System.out.println(even + odd);
        }

    }
}
