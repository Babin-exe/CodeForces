// Problem link: https://codeforces.com/problemset/problem/1807/D

#include <bits/stdc++.h>
using namespace std;

int main()
{
    long long t;
    cin >> t;
    while (t--)
    {
        int n, q;
        cin >> n >> q;
        vector<long long> hehe(n + 1, 0);
        for (int i = 1; i <= n; i++)
        {
            int x;
            cin >> x;
            hehe[i] = hehe[i - 1] + x;
        }
        long long sum = hehe[n];
        while (q--)
        {

            int l, r, k;
            cin >> l >> r >> k;
            long long sub = hehe[r] - hehe[l - 1];
            long long ans = sum - sub + 1LL * (r - l + 1) * k;
            if (ans % 2 == 1)
                cout << "YES" << endl;
            else
                cout << "NO" << endl;
        }
    }

    return 0;
}
