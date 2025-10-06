// Problem Link : https://codeforces.com/problemset/problem/1606/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (s.charAt(0) == s.charAt(s.length() - 1))
                System.out.println(s);
            else {
                char take = s.charAt(0);
                String ans = s.substring(0, s.length() - 1) + take;
                System.out.println(ans);
            }

        }
        sc.close();
    }
}
