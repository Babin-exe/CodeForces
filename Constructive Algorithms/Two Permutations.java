// Problem link : https://codeforces.com/problemset/problem/1761/A


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((n - 2 >= a + b) || (a == n && b == n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }
}
