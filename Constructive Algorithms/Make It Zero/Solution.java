// Problem link : https://codeforces.com/problemset/problem/1869/A
import java.util.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] arr = new long[(int) n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            if (n % 2 == 0) {
                System.out.println(2);
                System.out.println(1 + " " + n);
                System.out.println(1 + " " + n);
            } else {
                System.out.println(4);
                System.out.println(1 + " " + (n - 1));
                System.out.println(1 + " " + (n - 1));
                System.out.println(n - 1 + " " + n);
                System.out.println(n - 1 + " " + n);
            }
        }
        sc.close();
    }
}
