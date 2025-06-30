
//problem link : https://codeforces.com/contest/1791/problem/C

import java.util.Scanner;
 
public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
 
            int n = sc.nextInt();
 
            sc.nextLine();
 
            String s = sc.nextLine();
 
            int i = 0;
 
            int j = n - 1;
 
            while (j > i
                    && ((s.charAt(i) == '1' && s.charAt(j) == '0') || (s.charAt(i) == '0' && s.charAt(j) == '1'))) {
                i++;
                j--;
            }
            System.out.println(j - i + 1);
            
 
        }
        sc.close();
    }
}
