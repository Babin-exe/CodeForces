// Problem link: https://codeforces.com/problemset/problem/2111/A/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();
            System.out.println(2 * (32 - Integer.numberOfLeadingZeros(x)) + 1);
        }
    }
}
