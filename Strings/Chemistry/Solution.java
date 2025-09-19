// Problem link : https://codeforces.com/problemset/problem/1883/B
import java.util.*;

public class Answer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int[] arr = new int[26];

            for (int i = 0; i < n; i++) {

                char ch = s.charAt(i);
                arr[ch - 'a']++;
            }
            int odd_count = 0;
            for (int i = 0; i < 26; i++) {
                if (arr[i] % 2 != 0)
                    odd_count++;
            }
            if (odd_count - k <= 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
