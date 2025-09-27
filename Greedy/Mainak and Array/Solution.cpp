// Problem link : https://codeforces.com/problemset/problem/1726/A

#include <bits/stdc++.h>
using namespace std;

int main()
{
    long long t;
    cin >> t;
    while (t--)
    {
        int ans = -1000000007;
        int n;
        cin >> n;
        vector<int> hehe(n);
        for (int i = 0; i < n; i++)
        {

            cin >> hehe[i];
        }

        for (int i = 0; i < n; ++i)
        {
            ans = max(ans, hehe[(i - 1 + n) % n] - hehe[i]);
        }
        for (int i = 1; i < n; i++)
        {
            ans = max(ans, hehe[i] - hehe[0]);
        }
        for (int i = 0; i < n - 1; i++)
        {
            ans = max(ans, hehe[n - 1] - hehe[i]);
        }

        cout << ans << endl;
    }
    return 0;
}
