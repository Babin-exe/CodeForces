// Problem link : https://codeforces.com/contest/2119/problem/A



import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (a == b) {
                System.out.println(0);
            }

            else if (a > b) {
                if ((a ^ 1) == b) {
                    System.out.println(y);
                } else {
                    System.out.println(-1);
                }
            } else {

                if (x <= y) {

                    System.out.println((b - a) * x);

                } else {
                    int money = 0;
                    while (a != b) {
                        if (a % 2 == 0) {
                            money += Math.min(x, y);
                        } else {
                            money += x;
                        }
                        a++;
                    }
                    System.out.println(money);
                }

            }

        }

        sc.close();
    }
}
