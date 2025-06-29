// Problem Link : https://codeforces.com/problemset/problem/1805/A


import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                total ^= arr[i];
            }
            if (n % 2 == 1) {
                System.out.println(total);

            } else {
                if (total == 0) {
                    System.out.println(total);
                } else {
                    System.out.println(-1);
                }

            }
        }
        sc.close();
    }
}
