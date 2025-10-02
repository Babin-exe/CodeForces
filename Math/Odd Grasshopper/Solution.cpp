// Problem link : https://codeforces.com/problemset/problem/1607/B
#include <bits/stdc++.h>
using namespace std;
using ll = long long;
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--)
    {

        long long x;
        long long n;
        cin >> x;
        cin >> n;
        ll ans;
        if (n % 4 == 0)
            ans = 0;
        if (n % 4 == 1)
            ans = -n;
        if (n % 4 == 2)
            ans = 1;
        if (n % 4 == 3)
            ans = n + 1;

        if (x % 2 == 0)
            ans = x + ans;
        else
            ans = x - ans;

        cout << ans << "\n";

    }
    return 0;
}
