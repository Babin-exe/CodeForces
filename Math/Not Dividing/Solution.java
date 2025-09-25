// Problem link : https://codeforces.com/problemset/problem/1794/B
import java.util.*;

public class Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            arr[0] = sc.nextInt();
            if (arr[0] == 1)
                arr[0] = 2;
            for (int i = 1; i < n; i++) {
                int take = sc.nextInt();
                if (take == 1)
                    take = 2;
                if (take % arr[i - 1] == 0)
                    arr[i] = (take + 1);
                else
                    arr[i] = take;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
