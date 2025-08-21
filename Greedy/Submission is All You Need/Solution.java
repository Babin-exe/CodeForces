// Problem link : https://codeforces.com/problemset/problem/2130/A
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.max(sc.nextInt(), 1);
            }
            System.out.println(sum);

        }

        sc.close();
    }
}
