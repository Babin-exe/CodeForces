import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();

            int maxFreq = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
                maxFreq = Math.max(maxFreq, freq.get(x));
            }

            int ans = 0;
            int curr = maxFreq;
            while (curr < n) {
                int add = Math.min(curr, n - curr);
                ans += add + 1;
                curr += add;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
