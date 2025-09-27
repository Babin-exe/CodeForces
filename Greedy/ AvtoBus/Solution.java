// Problem Link: https://codeforces.com/problemset/problem/1679/A

  import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n < 4 || n % 2 == 1) {
                System.out.println(-1);
            } else {
                long maxi = n / 4;
                long mini = (n+5)/6;
                System.out.println(mini + " " + maxi);
            }

        }
        sc.close();
    }
}
