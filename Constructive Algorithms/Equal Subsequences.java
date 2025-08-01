// Problem link : https://codeforces.com/problemset/problem/2118/A


import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- > 0) {
 
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            for (int i = 0; i <k; i++) {
                System.out.print(1);
            }
            for (int i = 0; i < n-k; i++) {
                System.out.print(0);
            }
            System.out.println();
 
        }
        sc.close();
    }
}
