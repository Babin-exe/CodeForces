// Problem link : https://codeforces.com/problemset/problem/2121/B


import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[26];
        int t = sc.nextInt();
        while (t-- > 0) {
 
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
 
            for (int i = 0; i < n; i++) {
                arr[s.charAt(i) - 'a']++;
            }
            // now lets check from the 1st index to n-1
            // we dont check the first and last because 1st is for a and last is for c
 
            boolean hehe = false;
            for (int i = 1; i < n - 1; i++) {
                if (arr[s.charAt(i) - 'a'] > 1) {
                    System.out.println("Yes");
                    hehe = true;
                    break;
 
                }
            }
            if (!hehe) {
                System.out.println("No");
            }
            Arrays.fill(arr, 0);
 
        }
        sc.close();
    }
}
