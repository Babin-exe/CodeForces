// Problem link : // Problem link : https://codeforces.com/problemset/problem/1666/D

import java.util.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a, b;
            a = sc.next();
            b = sc.next();
            int[] index = new int[26];

            for (int i = 0; i < b.length(); i++) {
                char ch = b.charAt(i);
                index[ch - 'A']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = a.length() - 1; i >= 0; i--) {
                char c = a.charAt(i);
                if (index[c - 'A'] > 0) {
                    index[c - 'A']--;
                    sb.append(c);
                }
            }
            sb.reverse();
            if (sb.toString().equals(b))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();

    }
}
