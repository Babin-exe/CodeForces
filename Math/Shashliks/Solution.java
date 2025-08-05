// Problem link : https://codeforces.com/problemset/problem/2113/A
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            long k = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
 
            if (x > y) {
                long temp = x;
                x = y;
                y = temp;
                temp = a;
                a = b;
                b = temp;
            }
 
            long ans = 0;
 
            long diffa = k - a;
            if (diffa >= 0) {
                long useX = diffa / x + 1;
                ans += useX;
                k -= useX * x;
            }
 
            long diffb = k - b;
            if (diffb >= 0) {
                ans += diffb / y + 1;
            }
 
            System.out.println(ans);
        }
    }
}
