// Problem Link : https://codeforces.com/problemset/problem/1582/B
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int z = 0;
            int o = 0;
            for (int i = 0; i < n; i++) {
                long take = sc.nextLong();
                if (take == 1)
                    o++;
                else if (take == 0)
                    z++;
            }
            System.out.println(o * (1L << z));
        }
        sc.close();
    }
}
