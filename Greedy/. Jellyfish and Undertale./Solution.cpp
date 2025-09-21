// Problem link : https://codeforces.com/contest/1875/problem/A

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        long long a, b;
        cin >> a >> b;
        int n;
        cin >> n;

        long long ans = b;

        for (int i = 0; i < n; i++)
        {
            long long x;
            cin >> x;
            if (1 + x <= a)
            {
                ans += x;
            }
            else
            {
                ans += a - 1;
            }
        }
        cout << ans << endl;
    }
    return 0;
}
